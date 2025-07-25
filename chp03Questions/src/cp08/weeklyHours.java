package cp08;

import java.util.Scanner;

public class weeklyHours {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("çalışan sayısını giriniz: ");
        int sayi = in.nextInt();

        String[] calisanlar = new String[sayi];
        for (int i = 0; i < sayi; i++) {
            System.out.println(i + 1 + " . çalışanın adını giriniz.");
            calisanlar[i] = in.next();
        }
        String[] gunler = {"pazartesi", "salı", "çarşamba", "perşembe", "cuma", "cumartesi", "pazar"};

        int[][] saatler = new int[sayi][7];

        for (int i = 0; i < sayi; i++) {
            System.out.println("\n" + calisanlar[i] + " için çalışma saatlerini girin");
            for (int k = 0; k < 7; k++) {
                System.out.println(gunler[k] + " :");
                saatler[i][k] = in.nextInt();

            }
        }
        System.out.println("\n ÇALIŞMA TABLOSU (Saat):\n");


        System.out.printf("%-15s", "Çalışan");
        for (String gun : gunler) {
            System.out.printf("%-12s", gun);
        }
        System.out.println();


        for (int i = 0; i < sayi; i++) {
            System.out.printf("%-15s", calisanlar[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-12d", saatler[i][j]);
            }
            System.out.println();
        }

        in.close();

    }
}
