package Mang;

import java.util.Scanner;

public class timMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap SO LUONG PHAN TU cua mang");
        int m1 = scanner.nextInt();
        int[] mang = new int[m1];
        System.out.println("nhap CAC PHAN TU cua mang ");
        for (int i = 0; i < m1; i++) {
            mang[i] = scanner.nextInt();
        }
        int min = timMin(mang);
        System.out.println(min);
    }
    static int timMin(int[] mang){
        int min = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if (min > mang[i]){
                min=mang[i];
            }
        }return min;
}
}
