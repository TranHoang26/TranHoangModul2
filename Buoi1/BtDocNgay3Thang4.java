import java.util.Scanner;

public class BtDocNgay3Thang4 {
    public static void main(String[] args) {
        //Bai 1 :
//        int a;
//        int b;
//        System.out.println("Nhap so a ");
//        Scanner num1 = new Scanner(System.in);
//        a = num1.nextInt();
//        System.out.println("Nhap so b ");
//        Scanner num2 = new Scanner(System.in);
//        b = num2.nextInt();
//        if (a%b==0){
//            System.out.println("So " + a + " chia het cho so " + b);
//        }else {
//            System.out.println("So " + a + " khong chia het cho so " + b);
//        }


        //Bai 2:
//        int age;
//        System.out.println("Nhap tuoi");
//        Scanner scanner=new Scanner(System.in);
//        age = scanner.nextInt();
//        if (age>=16){
//            System.out.println("Hoc sinh du dieu kien hoc lop 10");
//        }else {
//            System.out.println("Hoc sinh chua du dieu kien hoc lop 10");
//        }



        //Bai 3:
//        int num;
//        System.out.println("Nhap so can kiem tra");
//        Scanner check = new Scanner(System.in);
//        num = check.nextInt();
//        if (num > 0){
//            System.out.println("So " + num  + " lon hon 0");
//        } else if (num ==0) {
//            System.out.println("So " + num  + " bang so 0");
//        }else {
//            System.out.println("So "+num+ " nho hon 0");
//        }



        //Bai 4:
//        int a;
//        int b;
//        int c;
//        System.out.println("nhap so a");
//        Scanner num1 = new Scanner(System.in);
//        a=num1.nextInt();
//
//        System.out.println("nhap so b");
//        Scanner num2 = new Scanner(System.in);
//        b=num2.nextInt();
//
//        System.out.println("nhap so c");
//        Scanner num3 = new Scanner(System.in);
//        c=num3.nextInt();
//
//        if (a>b && a>c){
//            System.out.println("a la so lon nhat : " + a);
//        } else if (b>a && b>c){
//            System.out.println("b la so lon nhat : "+ b);
//        } else {
//            System.out.println("c la so lon nhat : "+ c);
//        }




        //Bai 5:
//        double diemKiemtra;
//        double diemGiuaky;
//        double diemCuoiKy;
//        double diemTb;
//        System.out.println("Nhap diem Kiem tra :");
//        Scanner score1 =new Scanner(System.in);
//        diemKiemtra = score1.nextDouble();
//
//        System.out.println("Nhap diem Giua ky :");
//        Scanner score2 =new Scanner(System.in);
//        diemGiuaky = score2.nextDouble();
//
//        System.out.println("Nhap diem Cuoi ky :");
//        Scanner score3 =new Scanner(System.in);
//        diemCuoiKy = score3.nextDouble();
//
//        diemTb = (diemKiemtra + diemGiuaky + diemCuoiKy)/3;
//
//        if (diemTb>=9){
//            System.out.println("Hoc luc gioi: "+ diemTb);
//        } else if (diemTb<9 && diemTb >= 7) {
//            System.out.println("Hoc luc kha: " + diemTb);
//        }else if (diemTb<7 && diemTb>=5){
//            System.out.println("Hoc luc Trung binh: " + diemTb);
//        }else {
//            System.out.println("Hoc luc yeu: " + diemTb);
//        }



        //Bai 6:
//        int doanhSo;
//        int hoaHong;
//        int chietkhau;
//        System.out.println("Nhap doanh so ban hang :");
//        Scanner money = new Scanner(System.in);
//        doanhSo = money.nextInt();
//        if (doanhSo>=100000000){
//            chietkhau = 20;
//            hoaHong = (doanhSo*chietkhau)/100;
//            System.out.println("nhan vien duoc chiet khau "+ chietkhau + "% la " + hoaHong + "VND");
//        } else if (doanhSo>50000000 && doanhSo<100000000) {
//            chietkhau = 15;
//            hoaHong = (doanhSo*chietkhau)/100;
//            System.out.println("nhan vien duoc chiet khau "+ chietkhau + "% la " + hoaHong + "VND");
//        } else if (doanhSo<50000000 && doanhSo>20000000) {
//            chietkhau = 10;
//            hoaHong = (doanhSo*chietkhau)/100;
//            System.out.println("nhan vien duoc chiet khau "+ chietkhau + "% la " + hoaHong + "VND");
//
//        }else if (doanhSo<20000000 && doanhSo>=5000000){
//            chietkhau = 50;
//            hoaHong = (doanhSo*chietkhau)/100;
//            System.out.println("nhan vien duoc chiet khau "+ chietkhau + "% la " + hoaHong + "VND");
//        }else {
//            System.out.println("nhan vien khong dat chi tieu");
//        }


//        Bai 1:

//        double doC;
//        double doF;
//        System.out.println("Nhap do C");
//        Scanner doi = new Scanner(System.in);
//        doC = doi.nextDouble();
//        doF = doC * 9/5 +32;
//        System.out.println(doC + "do C " + " bang " + doF + " Do F");



//        Bai 2:
//        double met;
//        double feet;
//        System.out.println("Nhap met");
//        Scanner m = new Scanner(System.in);
//        met = m.nextDouble();
//        feet = met * 3.2808;
//        System.out.println( met + "met " + "bang " + feet + " feet");


//        Bai 3
//        double canh;
//        double dienTich;
//        System.out.println("nhap 1 canh cua hinh vuong");
//        Scanner s = new Scanner(System.in);
//        canh = s.nextDouble();
//        dienTich = canh * canh ;
//        System.out.println("dien tich cua hinh vuong co canh " + canh + " la " + dienTich);


//        Bai 4
//        double canha;
//        double canhb;
//        double dienTich;
//        System.out.println("Nhap canh a");
//        Scanner a = new Scanner(System.in);
//        canha = a.nextDouble();
//
//        System.out.println("Nhap canh b");
//        Scanner b = new Scanner(System.in);
//        canhb = b.nextDouble();
//
//        dienTich = canha*canhb;
//        System.out.println("dien tich hinh chu nhat : " + dienTich);



//        Bai 5
//        double canha;
//        double canhb;
//        double dienTich;
//        System.out.println("Nhap canh a");
//        Scanner a = new Scanner(System.in);
//        canha = a.nextDouble();
//
//        System.out.println("Nhap canh b");
//        Scanner b = new Scanner(System.in);
//        canhb = b.nextDouble();
//
//        dienTich = (canha/2)*canhb;
//        System.out.println("dien tich tam giac vuong la " + dienTich);



        //Bai 7:

//        double a;
//        double b;
//        double c;
//        double delta;
//        double x1;
//        double x2;
//
//        System.out.println("Nhap he so a cua x^1");
//        Scanner ax = new Scanner(System.in);
//        a = ax.nextDouble();
//
//        System.out.println("Nhap he so b ");
//        Scanner by = new Scanner(System.in);
//        b = by.nextDouble();
//
//        System.out.println("Nhap he so c");
//        Scanner hesoc = new Scanner(System.in);
//        c = hesoc.nextDouble();
//
//        delta = (b*b)-(4*a*c);
//        if (delta>0){
//            System.out.println("phuong trinh cos 2 nghiem phan biet");
//            x1= (-b+ Math.sqrt(delta))/(2*a);
//            System.out.println("Nghiem thu 1 la : "+ x1);
//            x2 = (-b)- Math.sqrt(delta)/(2*a);
//            System.out.println("Nghiem thu 2 la : "+ x2);
//        } else if (delta==0) {
//            x1=x2=(-b)/(2*a);
//            System.out.println("phuong trinh co nghiem kep la " + x1 + " va "+ x2 );
//        }else if (delta<0){
//            System.out.println("phuong trinh vo nghiem");
//        }

//        Bai 8

//        int age;
//        System.out.println( "Nhap tuoi can kiem tra ");
//        Scanner check = new Scanner(System.in);
//        age = check.nextInt();
//        if (age%1==0 && age<120 && age > 0){
//            System.out.println("Day la tuoi cua 1 nguoi ");
//        }else {
//            System.out.println("day khong phai la tuoi cua 1 nguoi");
//        }


//        Bai 9
//        double canha;
//        double canhb;
//        double canhc;
//        double ab;
//        double bc;
//        double ca;
//        System.out.println("nhap canh a");
//        Scanner a = new Scanner(System.in);
//        canha = a.nextDouble();
//
//        System.out.println("nhap canh b");
//        Scanner b = new Scanner(System.in);
//        canhb = b.nextDouble();
//
//        System.out.println("nhap canh c");
//        Scanner c = new Scanner(System.in);
//        canhc = c.nextDouble();
//
//        ab = canha+canhb;
//        bc = canhb+canhc;
//        ca = canhc+canha;
//
//        if(ab>canhc && bc>canha && ca>canhb){
//            System.out.println("a, b, c la 3 canh cua 1 tam giac");
//        }else {
//            System.out.println("a, b, c khong phai la 3 canh cua 1 tam giac");
//        }




    }
}
