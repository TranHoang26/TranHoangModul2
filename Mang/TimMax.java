package Mang;

public class TimMax {
    public static void main(String[] args) {
        int[][] mang = {
                {2,6,3,5,7},
                {1,6,3,5,9}
        };
        int max = timMax(mang);
        System.out.println(max);

    }
    static int timMax(int[][] mang){
        int max = mang[0][0];
        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                if (max<mang[i][j]){
                    max = mang[i][j];
                }
            }
        }return max;
    }
}
