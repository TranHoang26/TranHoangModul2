package Mang;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {

        int[] num ={3,5,4,6,7,8,2,9};
        int soCanXoa;
        Scanner xoa = new Scanner(System.in);
        soCanXoa = xoa.nextInt();
        int viTriCanXoa = VitriPhanTu(num , soCanXoa);
        if (viTriCanXoa==-1){
            System.out.println("Phan tu khong ton tai");
        }else{
            num=xoaPhanTu(num , viTriCanXoa);
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }


    static int VitriPhanTu(int[] num ,int soCanXoa){
        int viTri = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i]== soCanXoa){
                viTri=i;
                System.out.println("so can xoa la "+ soCanXoa + " o vi tri thu "+ i);
            }
        }
        return viTri;
    }

    static int[] xoaPhanTu(int[] num , int soCanXoa){
        int[] daySoMoi = new int[num.length-1];
        for (int i = 0; i < soCanXoa; i++) {
            daySoMoi[i]=num[i];
        }
        for (int i =soCanXoa+1; i <num.length ; i++) {
            daySoMoi[i-1]=num[i];
        }
        return daySoMoi;
    }
}
