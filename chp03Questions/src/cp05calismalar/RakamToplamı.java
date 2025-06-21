package cp05calismalar;

import java.util.Scanner;

public class RakamToplamı {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("rakamlarının toplanmasını istediğiniz sayıyı giriniz.");
        int n = sc.nextInt();
        int toplam  = 0;

        while (n>0){
            toplam += n%10;
            n = n/10;
        }
        System.out.println("Girdiğiniz sayısının rakamları toplamı : " + toplam);
    }
}
