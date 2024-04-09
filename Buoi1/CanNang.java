import java.util.Scanner;

public class CanNang {
    public static void main(String[] args) {
        double kg;
        double height;
        double bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap can nang (don vi kg)");
        kg = scanner.nextDouble();
        System.out.println("nhap chieu cao (don vi met)");
        height = scanner.nextDouble();
        bmi = kg / (height*height);
        if (bmi<18.5){
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <=25.0){
            System.out.println("Normal");
        }else if (bmi > 25.0 && bmi <=30.0){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }

    }
}
