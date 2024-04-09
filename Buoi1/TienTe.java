import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        int Usd;
        int VND = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so USD muon chuyen doi");
        Usd = VND * scanner.nextInt();
        System.out.println(Usd);
    }
}
