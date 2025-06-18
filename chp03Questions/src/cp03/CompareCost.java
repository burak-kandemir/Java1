package cp03;

import java.util.Scanner;

public class CompareCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("karşılaştırma yapılacak paketlerden ilkinin fiyat ve kg bilgilerini giriniz");
        double fiyat1 = input.nextDouble();
        double kilo1 = input.nextDouble();
        System.out.println("karşılaştırma yapılacak paketlerden ikincisinin fiyat ve kg bilgilerini giriniz");
        double fiyat2 = input.nextDouble();
        double kilo2 = input.nextDouble();

        double paket1 = kilo1/fiyat1;
        double paket2 = kilo2/fiyat2;

        if(paket1>paket2){
            System.out.println("ikinci paket daha uygun fiyatlıdır");
        }else{
            System.out.println("ilk paket daha uygun fiyatlıdır");
        }
    }
}
