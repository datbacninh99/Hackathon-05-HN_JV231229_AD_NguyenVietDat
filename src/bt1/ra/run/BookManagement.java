package bt1.ra.run;

import bt1.ra.business.IShop;
import bt1.ra.businessImp.Author;
import bt1.ra.businessImp.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BookManagement {
    private static ArrayList<IShop> itemList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập số tác giả và nhập thông tin các tác giả\n" +
                    "2. Nhập số sách và nhập thông tin các sách\n" +
                    "3. Sắp xếp sách theo giá xuất sách tăng dần (Comparable/Comparator)\n" +
                    "4. Tìm kiếm sách theo tên tác giả sách\n" +
                    "5. Thoát\n" +
                    "Mời chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    inputAuthor();
                    break;
                case 2:
                    inputBook();
                    break;
                case 3:
                    sortBookByPrice();
                    break;
                case 4:
                    searchBookByAuthorName();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập lại");
            }
        } while (true);
    }

    private static void inputAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tác giả:");
        int numAuthors = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numAuthors; i++) {
            Author author = new Author();
            System.out.println("Nhập thông tin tác giả thứ " + (i + 1));
            author.inputData();
            itemList.add(author);
        }
    }

    private static void inputBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số sách:");
        int numBooks = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numBooks; i++) {
            Book book = new Book();
            System.out.println("Nhập thông tin sách thứ " + (i + 1));
            book.inputData();
            itemList.add(book);
        }
    }

    private static void sortBookByPrice() {
        Collections.sort(itemList, Comparator.comparingDouble(IShop::getExportPrice));
        System.out.println("Danh sách sách sau khi sắp xếp theo giá xuất sách tăng dần:");
        for (IShop item : itemList) {
            System.out.println(item);
        }
    }

    private static void searchBookByAuthorName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên tác giả:");
        String authorName = scanner.nextLine();
        for (IShop item : itemList) {
            if (item instanceof Book && ((Book) item).getAuthor().equals(authorName)) {
                System.out.println(item);
            }
        }
    }
}