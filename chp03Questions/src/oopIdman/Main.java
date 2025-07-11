package oopIdman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman programına hoşgeldiniz");
        String idmanlar = "Geçerli idmanlar \n"
                + "Burpee\n"
                + "Situp\n"
                + "Squat\n"
                + "Pushup\n";
        System.out.println(idmanlar);

        System.out.println("bir idman oluşturun..");
        System.out.println("Bupee sayisi");
        int burpee=scanner.nextInt();
        System.out.println("situp sayisi");
        int situp=scanner.nextInt();
        System.out.println("squat sayisi");
        int squat=scanner.nextInt();
        System.out.println("pushup sayisi");
        int pushup=scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(burpee, situp, squat, pushup);
        System.out.println("idmanınız başlıyor..");


        while(idman.idmanBittiMi()==false){
            System.out.println("hareket türü ( Burpee, Pushup, Situp, Squat) ");
            String tur = scanner.nextLine();
            System.out.println("kaç tane yapacaksınız");
            int sayi=scanner.nextInt();
            scanner.nextLine();
            idman.HarketYap(tur, sayi);

        }
    }
}
