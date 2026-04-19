import java.util.*;

public class Ex_2_2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Solve first-degree equation with one variable");
            System.out.println("2. Solve system of first-degree equations with two variables");
            System.out.println("3. Solve second-degree equation with one variable");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    solveLinearEquation(scanner);
                    break;
                case 2:
                    solveLinearSystem(scanner);
                    break;
                case 3:
                    solveQuadraticEquation(scanner);
                    break;
                case 4:
                    System.out.println("Program exited");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        } while (choice != 4);
        scanner.close();
    }

    private static void solveLinearEquation(Scanner scanner) {
        System.out.println("Solving ax + b = 0");
        System.out.print("a = "); double a = scanner.nextDouble();
        System.out.print("b = "); double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinitely many solutions");
            } else {
                System.out.println("The equation has no solution");
            }
        } else {
            double x = -b/a;
            System.out.println("x = " + x);
        }
    }

    private static void solveLinearSystem(Scanner scanner) {
        System.out.println("Solving a11*x1 + a12*x2 = b1; a21*x1 + a22*x2 = b2");
        System.out.print("a11 = "); double a11 = scanner.nextDouble();
        System.out.print("a12 = "); double a12 = scanner.nextDouble();
        System.out.print("b1 = "); double b1 = scanner.nextDouble();
        System.out.print("a21 = "); double a21 = scanner.nextDouble();
        System.out.print("a22 = "); double a22 = scanner.nextDouble();
        System.out.print("b2 = "); double b2 = scanner.nextDouble();

        double D = a11*a22 - a21*a12;
        double D1 = b1*a22 - b2*a12;
        double D2 = a11*b2 - a21*b1;

        if (D != 0) {
            double x1 = D1/D;
            double x2 = D2/D;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            if(D1 == 0 && D2 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        }
    }

    private static void solveQuadraticEquation(Scanner scanner) {
        System.out.println("Solving ax^2 + bx + c = 0");
        System.out.print("a = "); double a = scanner.nextDouble();
        System.out.print("b = "); double b = scanner.nextDouble();
        System.out.print("c = "); double c = scanner.nextDouble();
        if(a == 0) {
            if(b == 0) {
                if (c == 0) {
                    System.out.println("The equation has infinitely many solutions");
                } else {
                    System.out.println("The equation has no solution");
                }
            } else {
                double x = -c/b;
                System.out.println("x = " + x);
            }
            return;
        }
        double D = b*b - 4*a*c;
        if(D > 0) {
            double x1 = (-b + Math.sqrt(D))/(2*a);
            double x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if(D == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("The equation has no solution");
        }
    }
}