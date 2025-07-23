package cp07Questions;

import java.util.Random;

public class couponCollector {
    public static void main(String[] args) {

        String[] turler = {"karo", "sinek", "kupa", "maca"};
        String[] sayi = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "vale", "queen", "king"};
        String[] deste = new String[52];
        int index = 0;
        for (int i = 0; i < turler.length; i++) {
            for (int j = 0; j < sayi.length; j++) {
                deste[index] = turler[i] + " " + sayi[j];
                index++;
            }
        }

        boolean[] bulunanTur = new boolean[4];
        int bulunanSayisi = 0;
        int cekilenKartSayisi = 0;
        Random rand = new Random();
        System.out.println("çekilen kartlar");
        while (bulunanSayisi < 4) {
            int rastgeleIndex = rand.nextInt(52);
            String kart = deste[rastgeleIndex];
            System.out.println(kart + " ");
            cekilenKartSayisi++;


            String tur = kart.split(" ")[0];
            for (int i = 0; i < turler.length; i++) {
                if (tur.equals(turler[i]) && !bulunanTur[i]) {
                    bulunanTur[i] = true;
                    bulunanSayisi++;
                    break;
                }


            }
        }
        System.out.println("tüm türler toplandı");
        System.out.println("çekilen kart sayısı : " + cekilenKartSayisi);

    }
}
