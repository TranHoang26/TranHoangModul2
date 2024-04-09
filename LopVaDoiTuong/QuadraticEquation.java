package LopVaDoiTuong;
public class QuadraticEquation {
    double a;
    double b;
    double c;
    QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void delta(){
        double delta = b*b-4*a*c;
        if (delta>0){
            System.out.println("Delta : "+ delta + " Phuong trinh co 2 nghiem");
        }else if (delta==0){
            System.out.println("Phuong trinh co 1 nghiem");
        }else {
            System.out.println("The equation has no roots");
        }
    }
    void getRoot1(){
        double getRoot1 = (-b) + Math.sqrt(b*b-4*a*c)/a*2;
        System.out.println(getRoot1);
    }
    void getRoot2(){
        double getRoot2 = -b - Math.sqrt(b*b-4*a*c)/(2*a);
        System.out.println(getRoot2);
    }
}
