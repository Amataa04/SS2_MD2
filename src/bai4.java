import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        // Tính tổng các số chẵn trong khoảng cho trước
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bắt đầu: ");
        int start = sc.nextInt();
        System.out.println("Nhập số kết thúc: ");
        int end = sc.nextInt();
        int sum = 0;

        for (int i = start; i <= end; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.printf("Tổng các số từ %d đến %d là: %d",start,end,sum);
    }
}
