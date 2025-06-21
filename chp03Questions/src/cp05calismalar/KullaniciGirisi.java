package cp05calismalar;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kullaniciAdi = "Burak Kandemir";
        String parola = "12345";
        int giris_hakki = 3;


        while (giris_hakki > 0) {
            System.out.println("kullanıcı adınızı giriniz");
            String kullaniciAdi1 = input.nextLine();
            System.out.println("parola giriniz");
            String parola1 = input.nextLine();


            if (kullaniciAdi1.equals(kullaniciAdi) && parola1.equals(parola)) {
                System.out.println("hoşgeldiniz : " + kullaniciAdi);
break;
            } else if (kullaniciAdi1.equals(kullaniciAdi) && !parola1.equals(parola)) {
                System.out.println("parolanız yanlış..");
                giris_hakki--;


            } else if (!kullaniciAdi1.equals(kullaniciAdi) && parola1.equals(parola)) {
                System.out.println("kullanıcı adınız yanlış..");
                giris_hakki--;

            } else if (!kullaniciAdi1.equals(kullaniciAdi) && !parola1.equals(parola)) {
                System.out.println("kullanıcı adınız ve parolanız yanlış..");
                giris_hakki--;
                {

                }

                if (giris_hakki == 0) {
                    System.err.println("3 defa hatalı giriş yaptınız");
                    break;
                }
            }
        }
    }
}