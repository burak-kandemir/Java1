package cp05calismalar;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bakiye = 1000;




        while(true){
            System.out.println("bakiye öğrenmek için '1', paraçekmek için '2' , para yatırmak için '3' , çıkış mapmak için '4' tuşuna basınız.");
            int secim = input.nextInt();
            if(secim == 1){
                System.out.println("bakiyeniz : " + bakiye + " tl'dir.");

            }else if(secim == 2){
                System.out.println("çekmek istediğiniz miktarı giriniz.");
                int cekim = input.nextInt();
                if(bakiye - cekim < 0){
                    System.out.println("bakiyenizden fazla para çekemezsiniz. bakiyeniz : " + bakiye);
                }else {
                    bakiye-=cekim;
                    System.out.println("kalan para miktarınız : " + bakiye);
                }
            }else if(secim == 3){
                System.out.println("yatırmak istediğiniz miktarı giriniz.");
                int yatan =  input.nextInt();
                bakiye+=yatan ;
                System.out.println("güncel para miktarınız : " + bakiye);

            }else if(secim == 4){
                System.out.println("sistemden çıkış yaptınız.");
                break;

            }else {
                System.err.println("yanlış giriş yaptınız.");


            }


        }
    }
}
