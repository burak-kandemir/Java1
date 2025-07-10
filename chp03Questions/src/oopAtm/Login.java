package oopAtm;

import java.util.Scanner;

public class Login {
    public static boolean login(Hesap hesap) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi;
        String sifre;
        System.out.println("kullanıcı adı : ");
        kullaniciAdi = input.nextLine();
        System.out.println("sifre : ");
        sifre = input.nextLine();
        if (hesap.getKullanici_adi().equals(kullaniciAdi) && hesap.getKullanici_password().equals(sifre)) {
            return true;
        } else {
            return false;
        }
    }
}
