import java.net.StandardSocketOptions;
import java.util.Scanner;

public class KullanıcıGirdisiyleAlanHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yaricap ;
        double alan;
        System.out.println("Alanı hesaplanacak yaricapi giriniz");

        yaricap = input.nextDouble();

        alan = yaricap * yaricap * 3.14;

        System.out.println("girdiğiniz yarıçapın alanı : " + alan);

    }
}
