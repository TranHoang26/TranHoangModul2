public class Circle {
    private double banKinh;
    private String color;

    public static final double PI = 3.14;

    public Circle(double banKinh, String color ){
        this.banKinh = banKinh;
        this.color = color;
    }

    public Circle() {
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double dienTich(double banKinh){
        double dienTich = PI*(banKinh*2);
        System.out.println("dien tich hinh tron : " + dienTich);
        return dienTich;
    }

}
