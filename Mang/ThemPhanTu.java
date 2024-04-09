package Mang;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int[] mang = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap VI TRI muon them ");
        int viTri = scanner.nextInt();
        System.out.println("nhap PHAN TU mon them");
        int phanTu = scanner.nextInt();
        int[] mangNew = themVaoMang(mang,phanTu,viTri);
        viTri = timViTri(mang,viTri);
        System.out.println(viTri);
        for (int i = 0; i < mangNew.length; i++) {
            System.out.print(mangNew[i]);
        }
    }
    static int timViTri(int[] mang , int viTri){
        for (int i = 0; i < mang.length; i++) {
            if (viTri==i){
                viTri = i;
            }
        } return viTri;
    }
    static int[] themVaoMang(int[] mang , int phanTu , int viTrimuonthem){
        int[] mangNew = new int[mang.length+1];
        for (int i = 0; i < viTrimuonthem; i++) {
            mangNew[i]=mang[i];
        }
        for (int i = viTrimuonthem; i <mang.length ; i++) {
            mangNew[i+1]=mang[i];
        }
        return mangNew;
    }
}
