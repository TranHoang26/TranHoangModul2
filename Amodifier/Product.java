package Amodifier;

public class Product {
    private double radius = 1.0;
    private String color = "red";
    Product(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius() {
        System.out.println(radius);
        System.out.println(color);
        return getRadius();
    }
    public String getArea(){
        return getArea();
    }
}
