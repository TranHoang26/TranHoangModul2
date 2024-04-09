package Amodifier;

public class Product2 {
    private String name ;
    private String clas ;
    Product2(String name, String clas) {
        this.name = name;
        this.clas = clas;
    }
    void diHoc() {
        System.out.println(name);
        System.out.println(clas);
    }
    public void getName(){
        System.out.println("vl");
    }
}
