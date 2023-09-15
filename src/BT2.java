import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        System.out.println("Nhập số tiền :");
        double vnd = 23000;
        double usd = new Scanner(System.in).nextDouble();
        double change = usd * 23000;
        System.out.println("Thành tiền : " + change + "VNĐ");
    }
}
