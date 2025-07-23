package cp07Questions;

import java.util.Scanner;

public class sortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("öğrenci sayısını giriniz");
        int mevcut = input.nextInt();

        String[] isimler = new String[mevcut];
        double[] sonuclar = new double[mevcut];
        for (int i = 0; i < mevcut; i++) {
            System.out.println(i + 1 + " . kişi");
            isimler[i] = input.next();
            System.out.println(i + 1 + ". kişinin notu");
            sonuclar[i] = input.nextDouble();

        }

        for (int i = 0; i < mevcut; i++) {
            int maxIndex = i;
            for (int j = 0; j < mevcut; j++) {
                if (sonuclar[j] > sonuclar[maxIndex]) {
                    maxIndex = j;
                }
            }
            double tempScore = sonuclar[i];
            sonuclar[i] = sonuclar[maxIndex];
            sonuclar[maxIndex] = tempScore;

            String tempName = isimler[i];
            isimler[i] = isimler[maxIndex];
            isimler[maxIndex] = tempName;

        }
        System.out.println("notlara göre sıralama");
        for (int i = 0; i < mevcut; i++) {
            System.out.println(isimler[i] + " : " + sonuclar[i]);
        }
        input.close();


    }

}
