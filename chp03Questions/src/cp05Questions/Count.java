package cp05Questions;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pozitif =0, negatif=0 ,  toplam = 0 , sayac =0 ;
        double ortalama=0 ;
        System.out.println("sıfır basınca sistemden çıkar. sayı giriniz");
        int sayi = scan.nextInt();

        while(sayi!=0){

            if(sayi>0) {
                pozitif++;
            }
                else if(sayi<0){
                    negatif++;
                }
               sayac++;
                toplam += sayi;
                sayi = scan.nextInt();
            }
        ortalama =toplam/sayac;
        System.out.println("pozitif sayı sayısı : " + pozitif + "\n" + "negatif sayı sayısı : " + negatif + "\n" + "girdiğiniz sayıların ortalaması : " + ortalama);

        }

    }

