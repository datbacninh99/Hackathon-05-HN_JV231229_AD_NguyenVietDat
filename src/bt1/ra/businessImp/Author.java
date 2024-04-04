package bt1.ra.businessImp;

import bt1.ra.business.IShop;

import java.util.Scanner;

public class Author implements IShop {
    private int authorId;
    private String authorName;
    private boolean sex;
    private int year;

    public Author() {
    }

    public Author(int authorId, String authorName, boolean sex, int year) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.sex = sex;
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã tác giả: ");
        authorId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên tác giả: ");
        authorName = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        sex = scanner.nextBoolean();
        System.out.println("Nhập năm sinh: ");
        year = scanner.nextInt();
    }

    @Override
    public void displayData() {
        System.out.println("Mã tác giả: " + authorId);
        System.out.println("Tên tác giả: " + authorName);
    }

    @Override
    public float getExportPrice() {
        return 0;
    }
}