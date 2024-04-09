package Mang;

import java.util.Scanner;

public class Noi2Mang {
    public static void main(String[] args) {
        Scanner mang = new Scanner(System.in);
        System.out.println("nhap SO LUONG PHAN TU cua mang 1");
        int m1 = mang.nextInt();
        int[] mang1 = new int[m1];
        System.out.println("nhap CAC PHAN TU cua mang 1 ");
        for (int i = 0; i < m1; i++) {
            mang1[i] = mang.nextInt();
        }
        System.out.println("nhap SO LUONG PHAN TU cua mang 2 ");
        int m2 = mang.nextInt();
        int[] mang2 = new int[m1];
        System.out.println("nhap CAC PHAN TU cua mang 2 ");
        for (int i = 0; i < m2; i++) {
            mang2[i] = mang.nextInt();
        }
        int[] mang3 = new int[m1+m2];
        for (int i = 0; i < m1; i++) {
            mang3[i]=mang1[i];
        }
        for (int i = 0; i < m2 ; i++) {
            mang3[m1+i]=mang2[i];
        }
        System.out.println("Mang sau khi gop : ");
        for (int i = 0; i < mang3.length; i++) {
            System.out.print(mang3[i]+ " ");
        }

    }
}
