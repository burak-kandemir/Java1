package Arrays;

import java.util.Scanner;

public class Main {
    private static Kart[][] kartlar = new Kart[4][4];

    public static void main(String[] args) {
        kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('F');
        kartlar[2][1] = new Kart('C');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('H');
        kartlar[3][0] = new Kart('E');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('B');
        kartlar[3][3] = new Kart('C');

        // OyunTahtası();
        while (oyunBittiMi() == false) {
            OyunTahtası();
            tahminEt();
        }

    }

    public static void tahminEt() {
        Scanner inpu = new Scanner(System.in);
        System.out.println("birinci tahmin (i ve j değerlerini bir boşlukla giriniz)");
        int i1 = inpu.nextInt();
        int j1 = inpu.nextInt();
        kartlar[i1][j1].setTahmin(true);
        OyunTahtası();
        System.out.println("ikinci tahmin (i ve j değerlerini bir boşlukla giriniz)");
        int i2 = inpu.nextInt();
        int j2 = inpu.nextInt();

        if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
            kartlar[i1][j2].setTahmin(true);
        } else {
            kartlar[i1][j1].setTahmin(false);
        }


    }

    public static boolean oyunBittiMi() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTahmin() == false) {
                    return false;
                }

            }
        }
        return true;
    }


    public static void OyunTahtası() {
        for (int i = 0; i < 4; i++) {
            System.out.println("_______________________");
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTahmin()) {
                    System.out.print(" |" + kartlar[i][j].getDeger() + "| ");

                } else {
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }

    }
}
