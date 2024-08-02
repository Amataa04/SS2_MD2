public class bai3 {
    public static void main(String[] args) {
        // Hiển thị ra những số chia hết cho cả 3 và 5 trong khoảng từ 1 đến 100
        for (int i = 1; i < 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
