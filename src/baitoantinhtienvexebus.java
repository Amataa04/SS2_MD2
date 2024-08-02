import java.util.Scanner;

public class baitoantinhtienvexebus {
    public static void main(String[] args) {
        /*
         Bài toán: Tính tiền vé xe bus biết:
            o Giá vé xe bus niêm yết: 7.000 VNĐ
            o Trẻ em có tuổi nhỏ hơn 6 được miễn phí xe bus
            o Học sinh tiểu học, trung học cơ sở và trung học
            phổ thông có tuổi từ 6 đến 18 được giảm 50%
            giá vé
            o Sinh viên, người lao động có tuổi từ 18 đến 60
            tuổi tính 100% giá vé
            o Người cao tuổi có tuổi trên 60 được miễn phí
        */
        System.out.println("Nhập số tuổi của bạn: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int price = 7000;
        double discount = 0.5;
        final double decreased = price - (price * discount);
        if(age < 6 || age > 60){
            System.out.println("Bạn được miễn phí vé xe bus");
        }
        else if(age >= 6 && age < 18){
            System.out.printf("Giá vé xe bus giảm chỉ còn: %.0fvnd", decreased);
        }
        else{
            System.out.println("Giá vé xe bus là 7000vnd");
        }
    }
}
