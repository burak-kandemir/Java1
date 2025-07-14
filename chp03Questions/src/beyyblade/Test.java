package beyyblade;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("beyblade programına hoşgeldiniz");
        System.out.println("çıkış için 'q' ya basınız");
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("hangi beyblade üretmek istiyorsunuz?");

            String islem = in.nextLine();
            if (islem.equals("q")) {
                System.out.println("programdan çıkılıyor..");
                break;
            }else{
                 BeybladeFabrikası fabrika = new BeybladeFabrikası();
                 Beyblade beyblade = fabrika.beybladeUret(islem);
                 if (beyblade==null) {
                     System.out.println("lütfen geçerli bir beyblade ismi giriniz");
                 }else{
                     beyblade.bilgileriGoster();
                     beyblade.kutsalCanavarOrtayaCikar();
                     beyblade.sadir();
                 }
            }

        }
    }
}
