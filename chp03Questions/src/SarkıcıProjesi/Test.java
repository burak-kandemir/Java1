package SarkıcıProjesi;

import java.util.Scanner;

public class Test {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);

    public static void islemleri_bastir() {
        System.out.println("\t 0 işlemleri görüntüle");
        System.out.println("\t 1 şarkıcıları görüntüle");
        System.out.println("\t 2 şarkıcı ekle");
        System.out.println("\t 3 şarkıcı güncelle");
        System.out.println("\t 4 şarkıcı sil");
        System.out.println("\t 0 5 şarkıcı ara");
        System.out.println("\t 6 programı sonlandır");
    }

    public static void sarkicilari_goruntule() {
        sarkicilar.sarkicilari_bastir();
    }

    public static void sil() {
        System.out.println("silmek istediğiniz şarkıcının pozisyonunu giriniz");
        int pozisyon = scanner.nextInt();
        sarkicilar.sarkici_sil(pozisyon);
    }

    public static void sarkici_ekle() {
        System.out.println("eklemek istediğiniz şarkıcının ismi?");
        String ismi = scanner.nextLine();
        sarkicilar.sarkici_ekle(ismi);
    }

    public static void sarkici_guncelle() {
        System.out.println("Güncellemek istediğiniz şarkıcının adını ve pozisyonunu giriniz");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        String guncelle = scanner.nextLine();
        sarkicilar.sarkici_guncelle(guncelle, pozisyon);
    }

    public static void ara() {
        System.out.println("hangi şarkıcıyı aramak istiyorsunuz");
        String aramak = scanner.nextLine();
        sarkicilar.sarkici_ara(aramak);

    }

    public static void main(String[] args) {
        System.out.println("\t Şarkıcı uygulamasına hoşgeldiniz...");
        islemleri_bastir();
        int islem;
        boolean cikis = false;

        while (!cikis) {
            System.out.println("yapmak istediğiniz işlemi seçiniz");
            islem = scanner.nextInt();
            scanner.nextLine();
            switch (islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkicilari_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("programdan çıkılıyor..");
                    break;
            }

        }
    }
}
