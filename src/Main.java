import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-3-MENU***************\n" +
                    "1. Nhập tên khách hàng chờ mua vé xem phim\n" +
                    "2. Khách tiếp theo\n" +
                    "3. Thoát");
            System.out.print("Vui lòng chọn số: ");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise) {
                case 1:
                    getQueue(sc, queue);
                    break;
                case 2:
                    comeBack(queue);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("vui lòng chọn từ 1->3");
            }
        } while (true);
    }

    public static void getQueue(Scanner sc, Queue<String> queue) {
        System.out.println("nhập tên khác hàng: ");
        String listName = sc.nextLine();
        queue.add(listName);
        System.out.println("Khách hàng đang đợi: "+queue);
    }
    public static void comeBack(Queue<String> queue){
        System.out.println("khách hàng đầu tiên dk là: " + queue.peek());
        queue.poll();
        System.out.println("sau khi thanh toán cho khách đầu tiên khách hàng còn lại sẽ là: " + queue);
    }
}
