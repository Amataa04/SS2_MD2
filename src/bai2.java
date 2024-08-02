import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        // Xây dựng một ứng dụng cho phép người dùng nhập vào 1 số từ 0 => 9 và hiển thị cách đọc của số đó trên màn hình
        System.out.println("Nhập số từ 0 đến 9: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 0:
                System.out.println("Số không");
                break;
            case 1:
                System.out.println("Số một");
                break;
            case 2:
                System.out.println("Số hai");
                break;
            case 3:
                System.out.println("Số ba");
                break;
            case 4:
                System.out.println("Số bốn");
                break;
            case 5:
                System.out.println("Số năm");
                break;
            case 6:
                System.out.println("Số sáu");
                break;
            case 7:
                System.out.println("Số bảy");
                break;
            case 8:
                System.out.println("Số tám");
                break;
            case 9:
                System.out.println("Số chín");
                break;
            default:
                System.out.println("Không nằm từ 0 đến 9");
        }
    }
}
