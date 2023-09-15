import java.util.Scanner;

public class BTH5 {
    public static void main(String[] args) {
        System.out.println("nhập tháng cần kiểm tra: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println("nhập năm cần kiểm tra: ");
        int year = sc.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + ": có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + ": có 30 ngày");
                break;
            case 2:
                if(year%4 == 0 && year%100 !=0){
                System.out.println("Tháng " + month + ": có 29 ngày");
                break;
                }else{
                    if(year%400 == 0){
                        System.out.println("Tháng " + month + ": có 29 ngày");
                        break;
                    }else {
                        System.out.println("Tháng " + month + ": có 28 ngày");
                        break;
                    }
                }
            default:
                System.out.println("tháng hoặc năm không hợp lệ!");
        }
    }
}
