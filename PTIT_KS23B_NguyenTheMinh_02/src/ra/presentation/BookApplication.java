package ra.presentation;

import ra.bussiness.BookBusiness;
import ra.entity.Book;
import ra.validate.BookValidate;

import java.util.Scanner;

public class BookApplication {
    public static final Book[] listBook = new Book[100];
    public static int countIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayShopMenu(scanner);
    }

    public static void displayShopMenu(Scanner scanner) {
        do {
            System.out.println("***************BOOK MENU*******************");
            System.out.println("1. Hiển thị danh sách các cuốn sách");
            System.out.println("2. Thêm mới sách");
            System.out.println("3. Chỉnh sửa thông tin sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Tìm kiếm sách");
            System.out.println("6. Sắp xếp");
            System.out.println("7. Thoát");
            int choice = BookValidate.validateInputInt(scanner, "Mời lựa chọn");
            switch (choice) {
                case 1:
                    System.out.println("Danh sách sách: ");
                    BookBusiness.displayBook();
                    break;
                case 2:
                    BookBusiness.addBook(scanner);
                    break;
                case 3:
                    BookBusiness.updateBook(scanner);
                    break;
                case 4:
                    BookBusiness.deleteBook(scanner);
                    break;
                case 5:
                    BookBusiness.searchBook(scanner);
                    break;
                case 6:
                    BookBusiness.sortBooks(scanner);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, yêu cầu chọn lại từ 1 - 7");
                    break;
            }
        } while (true);
    }
}
