import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điển toán : ");
        double t = sc.nextDouble();
        System.out.println("Nhập điển lý : ");
        double l = sc.nextDouble();
        System.out.println("Nhập điển hóa : ");
        double h = sc.nextDouble();
        double tb = (t + l + h) / 3;
        if (tb < 0 || tb > 10) {
            System.out.println("nhập điểm không hợp lệ");
        } else {
            if (tb < 5) {
                System.out.println("Điểm TB : " + tb + " - Xếp loại yếu");
            } else if (tb < 6.5) {
                System.out.println("Điểm TB : " + tb + " - Xếp loại trung bình");
            } else if (tb < 8) {
                System.out.println("Điểm TB : " + tb + " -Xếp loại khá");
            } else if (tb < 9) {
                System.out.println("Điểm TB : " + tb + " -Xếp loại giỏi");
            } else {
                System.out.println("Điểm TB : " + tb + " -Xếp loại xuất sắc");
            }
        }
    }
}
