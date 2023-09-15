import java.util.Scanner;

public class BTH7 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("nhập số cân nặng : ");
        double kg = sr.nextDouble();
        System.out.println("Nhập chiều cao : ");
        double m = sr.nextDouble();
        double bmi = kg / Math.pow(m,2);
        if (bmi < 18.5){
            System.out.println("Bạn quá gần");
        }else if(bmi <= 25){
            System.out.println("Bạn đang trạng thái bình thường");
        }else if (bmi <= 30){
            System.out.println("Bạn hơi béo");
        }else{
            System.out.println("Bạn quá béo cần giảm béo");
        }
    }
}
