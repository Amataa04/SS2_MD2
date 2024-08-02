public class bai5 {
    public static void main(String[] args) {
        // Trong phần này chúng ta sẽ phát triển một ứng dụng cho phép hiển thị các số nguyên tố nhỏ hơn 100
        // Số nguyên tố là một số nguyên dương chỉ chia hết cho 1 và chính nó
        for(int i = 2; i < 100; i++){
            if(isPrime(i)){
                System.out.printf("%d là số nguyên tố\n", i);
            }
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
