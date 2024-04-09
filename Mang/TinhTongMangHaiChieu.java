package Mang;

import java.util.Scanner;

public class TinhTongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so hang cua mang");
        int hang = scanner.nextInt();
        System.out.println("Nhap so cot cua mang");
        int cot = scanner.nextInt();
        int[][] mang = new int[hang][cot];
        System.out.println("Nhap cac phan tu cua mang");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                mang[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Nhap cot muon tinh tong");
        int cotIndex = scanner.nextInt();
        int sumCot = sum(hang,cotIndex,mang);
        System.out.println( "Tong cua cot"+ cotIndex + "bang: " + sumCot);
    }
    static int sum(int hang , int cotIndex, int[][]mang){
        int sumCot=0;
        for (int i = 0; i < hang; i++) {
            sumCot += mang[i][cotIndex];
        }
        return sumCot;
    }
}
