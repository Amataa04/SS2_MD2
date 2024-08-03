import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Nhập 3 cạnh");
            System.out.println("Cạnh a: ");
            double a = sc.nextDouble();
            System.out.println("Cạnh b: ");
            double b = sc.nextDouble();
            System.out.println("Cạnh c: ");
            double c = sc.nextDouble();
            if(isValidTriangle(a, b, c)){
                double chuVi = calculatePerimeter(a, b, c);
                double dienTich = calculateArea(a, b, c);

                System.out.printf("Chu vi hình tam giác là: %.2f\n", chuVi);
                System.out.printf("diện tích hình tam giác là: %.2f\n", dienTich);
                break;
            }
            else{
                System.out.println("3 cạnh nhập không hợp lệ. Vui lòng nhập lại!");
            }
        }
        sc.close();
    }
    // isValidTriangle
    public static boolean isValidTriangle(double a, double b, double c){
        return a + b > c && a + c > b && b + c > a;
    }
    // calculatePerimeter
    public static double calculatePerimeter(double a, double b, double c){
        return a + b + c;
    }
    // calculateArea
    public static double calculateArea(double a, double b, double c){
        double s = calculatePerimeter(a, b, c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
