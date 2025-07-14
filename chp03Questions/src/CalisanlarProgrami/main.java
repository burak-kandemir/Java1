package CalisanlarProgrami;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("çalışanlar programına hoşgeldiniz...");
        String islemler = "islemler...\n"
                + "1. Yazılımcı işlemleri\n"
                + "2.yönetici işlemleri\n"
                + "çıkış için 'q'ya basın";
        System.out.println("***********************************");
        System.out.println(islemler);
        System.out.println("*******************************");
        while (true) {
            System.out.print("işlem seçiniz");
            String islem = in.nextLine();
            if (islem.equals("q")) {
                System.out.println("programdan çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("burak ", 345, "kandemir", "java");
                String Yazilimci_islem = "1.format at\n "
                        + "2. bilgileri göster\n"
                        + "çikiş için 'q' basın ";
                System.out.println(Yazilimci_islem);
                while (true) {
                    System.out.println("işlemi seçiniz");
                    String y_islem = in.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("yazılımcı işlemlerinden çıkılıyor");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.print("işletim sistemi : ");
                        String isletim_sistemi = in.nextLine();
                        yazilimci.formatAt(isletim_sistemi);

                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();

                    } else {
                        System.out.println("geçersiz işlem");
                    }

                }

            } else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("alperen ", 123, "kandemir", 15);
                String Yonetici_islem = "1.zam yap\n "
                        + "2. bilgileri göster\n"
                        + "çıkış için q'ya basın";
                System.out.println(Yonetici_islem);
                while (true) {
                    System.out.println("işlem seçiniz");
                    String yonetici_islem = in.nextLine();
                    if (yonetici_islem.equals("q")) {
                        System.out.println("yönetici işlemlerden çıkılıyor...");
                        break;
                    } else if (yonetici_islem.equals("1")) {
                        System.out.println("yöneticinin ne kadar zam yapmasını istiyorsunuz?");
                        int zam_miktarı = Integer.parseInt(in.nextLine());
                        yonetici.ZamYap(zam_miktarı);
                    } else if (yonetici_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    } else {
                        System.out.println("geçersiz değer girdiniz...");
                    }
                }


            } else {
                System.out.println("geçersiz işlem...");
            }
        }

    }
}
