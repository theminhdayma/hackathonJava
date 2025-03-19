package ra.validate;

import java.util.Scanner;

public class BookValidate {
    public static String validateInputString(Scanner scanner, String massage, StringRule rule) {
        System.out.println(massage);
        do {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.err.println("Không được để trống");
                continue;
            }
            if (rule.isValidString(input)) {
                return input;
            }
            System.err.println("Không hợp lệ, yêu cầu nhập lại");
        } while (true);
    }

    public static int validateInputInt(Scanner scanner, String message) {
        System.out.println(message);
        do {
            if (!scanner.hasNextInt()) {
                System.err.println("Không phải số nguyên, yêu cầu nhập lại");
                scanner.nextLine();
                continue;
            }
            return Integer.parseInt(scanner.nextLine());
        } while (true);
    }

    public static double validateInputDouble(Scanner scanner, String message, double minValue) {
        System.out.println(message);
        do {
            if (!scanner.hasNextDouble()) {
                System.err.println("Dữ liệu không hợp lệ, vui lòng nhập lại");
                scanner.nextLine();
                continue;
            }
            double number = Double.parseDouble(scanner.nextLine());
            if (number > minValue) {
                return number;
            }
            System.err.printf("Giá trị phải lớn hơn %.2f, vui lòng nhập lại\n", minValue);
        } while (true);
    }
}
