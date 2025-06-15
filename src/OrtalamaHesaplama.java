import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ortalaması alınacak 3 sayı giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int sayi3 = input.nextInt();

        double ortalama = ((sayi1 + sayi2 + sayi3) / 3);

        System.out.println("Girdiğininz 3 sayının ortalaması : " + ortalama);
    }
}
