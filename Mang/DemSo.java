package Mang;

import java.util.Scanner;

public class DemSo {
    public static void main(String[] args) {
        int[] mang = {0,1,2,1,2,5,6,8,9,2,8,5,7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can kiem tra");
        int num = scanner.nextInt();
        int count = check(mang,num);
        System.out.println("So "+ num + " suat hien " + count + " lan");
    }

    static int check(int[] mang , int num){
        int count = 0;
        for (int i = 0; i < mang.length; i++) {
            if (num==mang[i]){
                count++;
            }
        } return count;
    }
}
