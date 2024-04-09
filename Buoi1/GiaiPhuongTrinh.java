import java.util.Scanner;

public class GiaiPhuongTrinh {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phuong trinh bac 1 a*x+b=c");
        System.out.println("Nhap a :");
        a = scanner.nextDouble();
        System.out.println("nhap b : ");
        b = scanner.nextDouble();
        System.out.println("Nhap c :");
        c = scanner.nextDouble();

        x = (c-b)/a;
        if (a!=0){
            System.out.println("Phuong trinh co 1 nghiem duy nhat x = "+ x);
        }else {
            if (b==c){
                System.out.println("Phuong trinh co vo so nghiem");
            }else {
                System.out.println("Phuong trinh vo nghiem");
            }

        }



    }
}
