package bt3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam_Advance_3 {
    private static Queue<String> customers = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU****************");
            System.out.println("1. Nhập tên khách hàng chờ mua vé xem phim");
            System.out.println("2. Khách tiếp theo");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập tên khách hàng: ");
                    String customer = scanner.nextLine();
                    addCustomer(customer);
                    break;
                case 2:
                    nextCustomer();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn lại.");
            }
        } while (true);
    }

    private static void addCustomer(String customer) {
        customers.add(customer);
        System.out.println("Đã thêm khách hàng: " + customer);
    }

    private static void nextCustomer() {
        if (!customers.isEmpty()) {
            String nextCustomer = customers.poll();
            System.out.println("Khách hàng tiếp theo: " + nextCustomer);
        } else {
            System.out.println("Không còn khách hàng nào trong hàng đợi");
        }
    }
}