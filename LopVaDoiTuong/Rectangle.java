package LopVaDoiTuong;

public class Rectangle {
        double height;
        double width;
        Rectangle(double height, double width){
            this.height=height;
            this.width=width;
        }
        void dienTich(double height, double width){
            double dienTich= height*width;
            System.out.println("Dien tich HCN la:  " + dienTich);
        }

        void chuVi(){
            double chuVI = (height+width)*2;
            System.out.println("Chu vi cua HCN la: "+chuVI);
        }

    }
