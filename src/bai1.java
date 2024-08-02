import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        // Kiểm tra 1 số có chia hết cho 3 và 5
        System.out.println("Nhập số nguyên ở đây: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 3 == 0 && n % 5 == 0) {
            System.out.printf("Số %d chia hết cho 3 và 5",n);
        }
        else if(n % 3 != 0 && n % 5 == 0){
            System.out.printf("Số %d ko chia hết cho 3",n);
        }
        else if(n % 5 != 0 && n % 3 == 0){
            System.out.printf("Số %d ko chia hết cho 5",n);
        }
        else{
            System.out.printf("Số %d ko chia hết cho 3 và 5",n);
        }
    }
}
