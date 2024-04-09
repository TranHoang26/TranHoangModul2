package LopVaDoiTuong;

public class Fan {
    private int speed;
    private  boolean off;
    private double banKinh =5;
    private  String color = "blue";
    Fan(int speed, boolean off, double banKinh, String color){
        this.speed=speed;
        this.off=off;
        this.banKinh=banKinh;
        this.color=color;
    }
    void fan(){
        if (true){
            System.out.println("on");
        }else {
            System.out.println("off");
        }
        System.out.println(color);
        System.out.println(speed);
        System.out.println(banKinh);
    }
}
