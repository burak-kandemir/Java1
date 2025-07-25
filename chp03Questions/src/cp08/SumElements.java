package cp08;

import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("matrisininz kaç satırdan oluşsun");
        int satir = in.nextInt();
        System.out.println("matrisiniz kaç sütundan oluşsun");
        int sutun = in.nextInt();

        double[][] dizi = new double[satir][sutun];

        System.out.println("matrisiniz elemanlarını giriniz");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                dizi[i][j] = in.nextDouble();

            }

        }
        satirToplam(dizi, satir);

    }

    public static void satirToplam(double[][] dizi, int satir) {
        for (int i = 0; i < satir; i++) {
            double toplam = 0;
            for (int j = 0; j < dizi[i].length; j++) {
                toplam += dizi[i][j];
            }
            System.out.println((i + 1) + ". satırın toplamı : " + toplam);
        }

    }
}
