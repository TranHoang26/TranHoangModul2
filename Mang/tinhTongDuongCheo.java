package Mang;

import java.util.Scanner;

public class tinhTongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap size cua ma tran");
        int size = scanner.nextInt();
        int[][] maTran = new int[size][size];
        System.out.println("Nhap cac phan tu cua ma tran");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                maTran[i][j]=scanner.nextInt();
                System.out.println(maTran[i][j]);
            }
        }
        int sum = sum(maTran,size);
        System.out.println(sum);
    }
    static int sum(int[][] maTran , int size){
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum+=maTran[i][i];
        }
       return sum;
    }
}