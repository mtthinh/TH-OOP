import java.util.Scanner;

public class Ex_6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        double[][] matrix1, matrix2, sumMatrix;

        System.out.println("--- Matrix Addition Program ---");
        System.out.println("1. Enter matrices from keyboard");
        System.out.println("2. Use constant matrices");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter number of rows: ");
            rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            cols = sc.nextInt();

            matrix1 = new double[rows][cols];
            matrix2 = new double[rows][cols];

            System.out.println("Enter elements for Matrix 1:");
            fillMatrix(sc, matrix1);
            System.out.println("Enter elements for Matrix 2:");
            fillMatrix(sc, matrix2);
        } else {
            // Ma trận hằng số (ví dụ 2x3)
            matrix1 = new double[][]{{1.5, 2, 3}, {4, 5.2, 6}};
            matrix2 = new double[][]{{7, 8.1, 9}, {0, 1.8, 2}};
            rows = matrix1.length;
            cols = matrix1[0].length;
            System.out.println("Using constant matrices of size " + rows + "x" + cols);
        }

        // Thực hiện cộng hai ma trận
        sumMatrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Hiển thị kết quả
        System.out.println("\nResultant Matrix (Sum):");
        displayMatrix(sumMatrix);

        sc.close();
    }

    // Hàm hỗ trợ nhập dữ liệu cho ma trận
    private static void fillMatrix(Scanner sc, double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextDouble();
            }
        }
    }

    // Hàm hỗ trợ hiển thị ma trận
    private static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}