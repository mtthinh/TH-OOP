import java.util.Scanner;

public class Ex_6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = -1;
        int year = -1;
        while(true) {
            System.out.print("Enter month (Full name, Abbreviation, 3 letters, or Number): ");
            String monthInput = sc.nextLine().trim();
            month = parseMonth(monthInput);
            System.out.print("Enter year (non-negative number, all digits): ");
            String yearInput = sc.nextLine().trim();
            year = parseYear(yearInput);
            if (month != -1 && year != -1) {
                int days = getDaysInMonth(month, year);
                System.out.println("Result: The month " + monthInput + " in year " + year + " has " + days + " days.");
                break; 
            } else {
                System.out.println("Invalid month or year. Please try again.\n");
            }
        }
        sc.close();
    }
    private static int parseMonth(String input) {
        String s = input.toLowerCase().replace(".", "");
        switch (s) {
            case "january": case "jan": case "1": return 1;
            case "february": case "feb": case "2": return 2;
            case "march": case "mar": case "3": return 3;
            case "april": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun": case "6": return 6;
            case "july": case "jul": case "7": return 7;
            case "august": case "aug": case "8": return 8;
            case "september": case "sep": case "9": return 9;
            case "october": case "oct": case "10": return 10;
            case "november": case "nov": case "11": return 11;
            case "december": case "dec": case "12": return 12;
            default: return -1;
        }
    }
    private static int parseYear(String input) {
        try {
            int y = Integer.parseInt(input);
            if (y >= 0 && input.length() >= 1) return y;
        } catch (NumberFormatException e) {
            return -1;
        }
        return -1;
    }
    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }
}