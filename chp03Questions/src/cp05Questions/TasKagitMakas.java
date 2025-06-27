package cp05Questions;

import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayacpc = 0;
        int sayacsecim = 0;

       while(sayacpc<3 && sayacsecim<3) {
            int pc = (int) (Math.random() * 3);

            System.out.println("taş için 0 kağıt için 1 veya makas için 2 tuşuna basınız");
            int secim = input.nextInt();

            switch (pc) {
                case 0:
                    if (secim == 0) {
                        System.out.println("berabere");
                    } else if (secim == 1) {
                        System.out.println("kaybettiniz");
                        sayacsecim++;
                    } else {
                        System.out.println("Tebrikler kazandınız.");
                    sayacpc++;
                    }
                    break;
                case 1:
                    if (secim == 0) {
                        System.out.println("Tebrikler kazandınız");
                        sayacpc++;
                    } else if (secim == 1) {
                        System.out.println("berabere");
                    } else {
                        System.out.println("kaybettiniz.");
                        sayacsecim++;
                    }
                    break;

                case 2:
                    if (secim == 0) {
                        System.out.println("kaybettiniz");
                        sayacpc++;
                    } else if (secim == 1) {
                        System.out.println("Tebrikler kazandınız.");
                        sayacsecim++;
                    } else {
                        System.out.println("berabere");
                    }
                    break;

            }if (sayacpc >=3 ){
                System.out.println("oyunu bilgisayar kazandı skor : " + sayacpc + " - " +  sayacsecim);
            } else if (sayacsecim>=3) {
                System.out.println("oyunu kazandınız skor : " + sayacsecim + " - " +  sayacpc);

            }
        }
    }
}