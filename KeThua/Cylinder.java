public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double theTich(double banKinh, double height){
        double theTich = PI*(banKinh*banKinh)*height;
        System.out.println("the tich hinh tru : "+theTich);
        return theTich;
    }
}
