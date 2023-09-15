import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        System.out.println("nhập chiều dài : ");
        int length = new Scanner(System.in).nextInt();
        System.out.println("nhập chiều rộng : ");
        int width = new Scanner(System.in).nextInt();
        System.out.println("hình chữ nhật có chu vi là : " + ((length + width)*2));
        System.out.println("hình chữ nhật có diện tích là : " + (length * width));
    }
}
