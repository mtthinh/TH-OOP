import java.util.Arrays;
import java.util.Scanner;

public class Ex_6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers;

        // Lựa chọn cách nhập dữ liệu
        System.out.println("Choose an option:");
        System.out.println("1. Enter array from keyboard");
        System.out.println("2. Use a constant array");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            numbers = new double[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextDouble();
            }
        } else {
            // Mảng hằng số mặc định
            numbers = new double[]{172.19, 161.4, 189.2, 12.5, 45.0};
            System.out.println("Using constant array: " + Arrays.toString(numbers));
        }

        // 1. Sắp xếp mảng (Sorting)
        Arrays.sort(numbers);

        // 2. Tính tổng (Sum)
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        // 3. Tính trung bình (Average)
        double average = (numbers.length > 0) ? (sum / numbers.length) : 0;

        // Hiển thị kết quả
        System.out.println("--- Results ---");
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f\n", average);

        scanner.close();
    }
}