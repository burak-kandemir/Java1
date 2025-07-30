package cp08;

import java.util.Scanner;

public class matrisKesif {

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        System.out.print("Matrisin boyutunu giriniz (örnek: 4): ");
        int boyut = giris.nextInt();

        int[][] matris = new int[boyut][boyut];


        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                matris[i][j] = (int) (Math.random() * 2);
            }
        }

        matrisiYazdir(matris);
        satirlariKontrolEt(matris);
        sutunlariKontrolEt(matris);
        caprazlariKontrolEt(matris);
    }

    public static void matrisiYazdir(int[][] matris) {
        System.out.println("\nOluşturulan Matris:");
        for (int[] satir : matris) {
            for (int eleman : satir) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void satirlariKontrolEt(int[][] matris) {
        boolean bulundu = false;
        for (int i = 0; i < matris.length; i++) {
            boolean hepsiAyni = true;
            int ilk = matris[i][0];
            for (int j = 1; j < matris[i].length; j++) {
                if (matris[i][j] != ilk) {
                    hepsiAyni = false;
                    break;
                }
            }
            if (hepsiAyni) {
                System.out.println("Tüm satır aynı: Satır " + i + " → (" + ilk + ")");
                bulundu = true;
            }
        }
        if (!bulundu) {
            System.out.println("Hiçbir satır tamamen aynı değil.");
        }
    }

    public static void sutunlariKontrolEt(int[][] matris) {
        boolean bulundu = false;
        for (int j = 0; j < matris[0].length; j++) {
            boolean hepsiAyni = true;
            int ilk = matris[0][j];
            for (int i = 1; i < matris.length; i++) {
                if (matris[i][j] != ilk) {
                    hepsiAyni = false;
                    break;
                }
            }
            if (hepsiAyni) {
                System.out.println("Tüm sütun aynı: Sütun " + j + " → (" + ilk + ")");
                bulundu = true;
            }
        }
        if (!bulundu) {
            System.out.println("Hiçbir sütun tamamen aynı değil.");
        }
    }

    public static void caprazlariKontrolEt(int[][] matris) {
        boolean solCaprazAyni = true;
        boolean sagCaprazAyni = true;

        int solIlk = matris[0][0];
        int sagIlk = matris[0][matris.length - 1];

        for (int i = 1; i < matris.length; i++) {
            if (matris[i][i] != solIlk) {
                solCaprazAyni = false;
            }
            if (matris[i][matris.length - 1 - i] != sagIlk) {
                sagCaprazAyni = false;
            }
        }

        if (solCaprazAyni) {
            System.out.println("Sol çapraz tamamen aynı → (" + solIlk + ")");
        } else {
            System.out.println("Sol çapraz tamamen aynı değil.");
        }

        if (sagCaprazAyni) {
            System.out.println("Sağ çapraz tamamen aynı → (" + sagIlk + ")");
        } else {
            System.out.println("Sağ çapraz tamamen aynı değil.");
        }
    }
}

