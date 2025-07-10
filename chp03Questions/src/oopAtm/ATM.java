package oopAtm;

import java.util.Scanner;

public class ATM {
    public void  calis(Hesap hesap) {
        Login login = new Login();
        Scanner input = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz");
        System.out.println("**********************");
        System.out.println("kullanıcı girişi");
        System.out.println("***********************");
        int giris_hakki = 3;
        while (true) {
            if (Login.login(hesap)) {
                System.out.println("Giriş başarılı");
                break;

            } else {
                System.out.println("giriş başarısız");
                giris_hakki -= 1;
                System.out.println("kalan giriş hakkı : " + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("giriş hakkınız bitmiştir.");
                return;
            }
        }
        System.out.println("**************************");
        String islemler = "1. bakiye görüntüle \n"
                + "2. işlem para yatırma\n"
                + "3.işlem para çekme \n"
                + "4. işlem 'çıkış'";
        System.out.println(islemler);
        System.out.println("**************************");
        while (true) {
            System.out.println("işlem seçiniz");
            String islem = input.nextLine();
            if (islem.equals("4")) {
                break;

            } else if (islem.equals("1")) {
                System.out.println("bakiyeniz: " + hesap.getBakiye());

            } else if (islem.equals("2")) {
                System.out.println("yatırmak istediğiniz tutar : ");
                int tutar = input.nextInt();
                input.nextLine();
                hesap.ParaYatir(tutar);
            } else if (islem.equals("3")) {
                System.out.println("çekmek istediğiniz tutar :");
                int tutar = input.nextInt();
                input.nextLine();

                hesap.ParaCek(tutar);
            } else {
                System.out.println("geçersiz işlem.");
            }


        }

    }
}
