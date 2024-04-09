import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
         int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam can kiem tra");
        year = scanner.nextInt();
        if (year%4==0 && year%100!=0){
            System.out.println(year + " La nam nhuan");
        } else if (year%100==0 && year%400==0){
            System.out.println(year + " La nam nhuan");
        } else {
            System.out.println(year + " Khong phai nam nhuan");
        }
    }
}
