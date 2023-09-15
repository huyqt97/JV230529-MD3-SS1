import java.util.Scanner;

public class Bt6 {
    public static void main(String[] args) {
        System.out.println("Nhập số cần kiểm tra : ");
        int nb = new Scanner(System.in).nextInt();
        if (nb % 3 == 0) {
            if (nb % 5 == 0) {
                System.out.println("Số : " + nb + " chia hết cho 3 và 5");
            } else {
                System.out.println("Số : " + nb + " chia hết cho 3");
            }

        } else if (nb % 5 == 0) {
            if (nb % 3 == 0) {
                System.out.println("Số : " + nb + " chia hết cho 3 và 5");
            } else {
                System.out.println("Số : " + nb + " chia hết cho 5");
            }
        }else {
            System.out.println("Số : " + nb + " không chia hết cho cả 3 và 5");
        }
    }
}
