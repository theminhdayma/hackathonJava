package ra.entity;

import ra.validate.BookValidate;
import ra.validate.StringRule;

import java.util.Scanner;

public class Book implements IApp{
    private String bookId;
    private String bookTitle;
    private String author;
    private String publisher;
    private int publicationYear;
    private String category;
    private double price;
    private int quantity;

    public Book() {}

    public Book(String bookId, String bookTitle, String author, String publisher,int publicationYear, String category, double price, int quantity) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void inputData(Scanner scanner) {
        this.bookId = BookValidate.validateInputString(scanner, "Nhập mã sách", new StringRule(0, 5));
        this.bookTitle = BookValidate.validateInputString(scanner, "Nhập vào tiêu đề sách", new StringRule(0,100));
        this.author = BookValidate.validateInputString(scanner, "Nhập vào tên tác giả", new StringRule(0, 50));
        this.publisher = BookValidate.validateInputString(scanner, "Nhập vào nhà xuất bản", new StringRule(0, 100));
        this.publicationYear = BookValidate.validateInputInt(scanner, "Nhập vào năm xuất bản");
        this.category = BookValidate.validateInputString(scanner, "Nhâ vào thể loại sách", new StringRule(0,100));
        this.price = BookValidate.validateInputDouble(scanner, "Nhập vào giá sách", 0);
        this.quantity = BookValidate.validateInputInt(scanner,"Nhập vào số lượng sách");
    }

    @Override
    public void displayData() {
        System.out.println("-------------------------------------------------");
        System.out.println("Mã sách: " + this.bookId);
        System.out.println("Tiêu đề sách: " + this.bookTitle);
        System.out.println("tác giả: " + this.author);
        System.out.println("Nhà xuất bản: " + this.publisher);
        System.out.println("Năm xuất bản: " + this.publicationYear);
        System.out.println("Thể loại: " + this.category);
        System.out.println("Gía sách: " + this.price);
        System.out.println("Số lượng sách: " + this.quantity);
    }
}
