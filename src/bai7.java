import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        /*
        Menu gồm:
            Kiểm tra tính chẵn lẻ của 1 số
            Kiểm tra số nguyên tố
            Kiểm tra một số có chia hết cho 3 không
            Thoát
        */
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Chọn một chức năng: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    checkEvenOdd(sc);
                    break;
                case 2:
                    checkPrime(sc);
                    break;
                case 3:
                    checkDivisibleByThree(sc);
                    break;
                case 4:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
                    break;
            }
        }
        while (choice != 4);
        sc.close();
    }
    // checkEvenOdd
    public static void checkEvenOdd(Scanner sc){
        System.out.println("Nhập 1 số: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.printf("%d là số chẵn\n", num);
        }
        else{
            System.out.printf("%d là số lẻ\n", num);
        }
    }
    // checkPrime
    public static void checkPrime(Scanner sc){
        System.out.println("Nhập 1 số: ");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.printf("%d là số nguyên tố\n", num);
        }
        else{
            System.out.printf("%d không phải là số nguyên tố\n", num);
        }
    }
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    // checkDivisibleByThree
    public static void checkDivisibleByThree(Scanner sc){
        System.out.println("Nhập 1 số: ");
        int num = sc.nextInt();
        if(num % 3 == 0){
            System.out.printf("%d là số chia hết cho 3\n",num);
        }
        else{
            System.out.printf("%d không chia hết cho 3\n",num);
        }
    }
}
