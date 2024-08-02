public class bai6 {
    public static void main(String[] args) {
        // [Bài tập] Hiển thị 20 số nguyên tố đầu tiên
        int num = 2;
        int cout = 0;
        while(cout < 20){
            if(isPrime(num)){
                System.out.printf("%d là số nguyên tố\n", num);
                cout++;
            }
            num++;
        }
    }
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
