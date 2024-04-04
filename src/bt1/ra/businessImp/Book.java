package bt1.ra.businessImp;

import bt1.ra.business.IShop;

import java.util.Scanner;
import java.util.ArrayList;

public class Book implements IShop {
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private Author author;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private boolean bookStatus;

    public Book() {
    }

    public Book(int bookId, String bookName, String title, int numberOfPages, Author author, float importPrice, int quantity, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.importPrice = importPrice;
        this.exportPrice = importPrice * RATE;
        this.quantity = quantity;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }


    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        bookId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sách: ");
        bookName = scanner.nextLine();
        System.out.println("Nhập tiêu đề sách: ");
        title = scanner.nextLine();
        System.out.println("Nhập số trang sách: ");
        numberOfPages = scanner.nextInt();
        System.out.println("Nhập giá nhập sách: ");
        importPrice = scanner.nextFloat();
        exportPrice = importPrice * RATE;
        System.out.println("Nhập số lượng sách: ");
        quantity = scanner.nextInt();
        System.out.println("Nhập trạng thái sách (true hoặc false): ");
        bookStatus = scanner.nextBoolean();

        // Chọn tác giả từ danh sách tác giả đã quản lý
        ArrayList<Author> authors = new ArrayList<>();
        System.out.println("Danh sách tác giả: ");
        for (Author author : authors) {
            System.out.println(author.getAuthorId() + ": " + author.getAuthorName());
        }
        System.out.println("Chọn mã tác giả cho sách: ");
        int authorId = scanner.nextInt();
        for (Author author : authors) {
            if (author.getAuthorId() == authorId) {
                this.author = author;
                break;
            }
        }
    }

    @Override
    public void displayData() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Tên tác giả: " + author.getAuthorName());
        System.out.println("Giá bán sách: " + exportPrice);
        System.out.println("Số lượng sách: " + quantity);
        System.out.println("Trạng thái: " + (bookStatus ? "Còn hàng" : "Hết hàng"));
    }
}