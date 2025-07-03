package cp06Questions;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz:");
        String sifre = input.nextLine();

        if (KarakterSayisi(sifre) && LettersDigits(sifre) && IkiRakam(sifre)) {
            System.out.println("Şifreniz geçerli");
        } else {
            System.out.println("Şifreniz geçerli değil");
        }
    }


    public static boolean KarakterSayisi(String sifre) {
        int uzunluk = sifre.length();
        if (uzunluk < 8) {
            System.out.println("şifreniz en az 8 karakterden oluşmalıdır");
            return false;
        }
        return true;
    }

    public static boolean LettersDigits(String sifre) {

        for (int i = 0; i < sifre.length()-1; i++) {
            char ch = sifre.charAt(i);
            if (!(ch >= 48 && ch <= 57 || ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122)) {
                System.out.println("şifreniz sadece rakam ve harflerden oluşmalıdır");
                return false;
            }
        }
        return true;
    }

    public static boolean IkiRakam(String sifre) {
        int sayac = 0;
        for (int i = 0; i < sifre.length()-1; i++) {
            char ch = sifre.charAt(i);
            if ((ch >= 48 && ch <= 57)) {
                sayac++;
            }

        }
        if (sayac < 2) {
            System.out.println("şifrenizde en az 2 rakam olmalıdır");
            return false;
        }
        return true;
    }
}





