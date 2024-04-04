package bt2;

import java.util.Scanner;
import java.util.Stack;

public class Exam_Advance_2 {
    private static Stack<String> history = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU****************");
            System.out.println("1. Nhập URL muốn truy cập");
            System.out.println("2. Quay lại");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập URL: ");
                    String url = scanner.nextLine();
                    visit(url);
                    break;
                case 2:
                    goBack();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn lại.");
            }
        } while (true);
    }

    private static void visit(String url) {
        history.push(url);
        System.out.println("Đã truy cập: " + url);
    }

    private static void goBack() {
        if (!history.empty()) {
            history.pop();
            if (!history.empty()) {
                System.out.println("URL tiếp theo: " + history.peek());
            } else {
                System.out.println("Không còn URL nào trong lịch sử");
            }
        } else {
            System.out.println("Không còn URL nào trong lịch sử");
        }
    }
}
