import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class VergiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" yıllık toplam gelirinizi giriniz ");
        double gelir = input.nextDouble();
        double vergi = 0;
        if (gelir < 158000) {
            vergi = (gelir * 0.15);

        } else if (gelir < 330000) {
            vergi = (158000 * 0.15) + ((gelir - 158000) * 0.20);

        } else if (gelir < 800000) {
            vergi = (158000 * 0.15) + ((330000 - 158000) * 0.20) + ((gelir - 330000) * 0.27);

        } else if (gelir < 4300000) {
            vergi = (158000 * 0.15) + ((330000 - 158000) * 0.20) + ((800000 - 330000) * 0.27) + ((gelir - 800000) * 0.35);
        } else {
            vergi = (158000 * 0.15) + ((330000 - 158000) * 0.20) + ((800000 - 330000) * 0.27) + ((4300000 - 800000) * 0.35) + ((gelir - 4300000) * 0.4);
        }
        System.out.println("ödemeniz gereken vergi miktarı " + vergi);
    }
}