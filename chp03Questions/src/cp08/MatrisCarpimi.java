package cp08;

import java.util.Scanner;

public class MatrisCarpimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matris boyutlarını al
        System.out.print("1. matrisin satır sayısı: ");
        int satir1 = scanner.nextInt();
        System.out.print("1. matrisin sütun sayısı: ");
        int sutun1 = scanner.nextInt();

        System.out.print("2. matrisin satır sayısı: ");
        int satir2 = scanner.nextInt();
        System.out.print("2. matrisin sütun sayısı: ");
        int sutun2 = scanner.nextInt();

        // Uyum kontrolü (A'nın sütunu == B'nin satırı)
        if (sutun1 != satir2) {
            System.out.println("Bu matrisler çarpılamaz. (1. matrisin sütunu ile 2. matrisin satırı eşit olmalı)");
            return;
        }

        // Matrisleri oluştur
        int[][] matris1 = new int[satir1][sutun1];
        int[][] matris2 = new int[satir2][sutun2];

        System.out.println("1. matrisin elemanlarını gir:");
        for (int i = 0; i < satir1; i++) {
            for (int j = 0; j < sutun1; j++) {
                System.out.print("matris1[" + i + "][" + j + "]: ");
                matris1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("2. matrisin elemanlarını gir:");
        for (int i = 0; i < satir2; i++) {
            for (int j = 0; j < sutun2; j++) {
                System.out.print("matris2[" + i + "][" + j + "]: ");
                matris2[i][j] = scanner.nextInt();
            }
        }

        // Çarpım işlemi
        int[][] carpimSonucu = matrisCarp(matris1, matris2);

        // Sonuçları yazdır
        System.out.println("Matrislerin çarpım sonucu:");
        for (int i = 0; i < carpimSonucu.length; i++) {
            for (int j = 0; j < carpimSonucu[0].length; j++) {
                System.out.print(carpimSonucu[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 🔁 Matris çarpımı yapan metod
    public static int[][] matrisCarp(int[][] a, int[][] b) {
        int satirA = a.length;
        int sutunA = a[0].length;
        int sutunB = b[0].length;

        int[][] sonuc = new int[satirA][sutunB];

        for (int i = 0; i < satirA; i++) {
            for (int j = 0; j < sutunB; j++) {
                for (int k = 0; k < sutunA; k++) {
                    sonuc[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return sonuc;
    }
}
