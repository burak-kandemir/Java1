
import java.util.Scanner;

public class ToplamaAraSinavi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi1 = (int)(Math.random() * 100);
        int sayi2 = (int)(Math.random() * 100);

        System.out.println(sayi1 + " + " + sayi2 + " = ? ");

        int toplam = input.nextInt();

        if(sayi1 + sayi2 == toplam){
            System.out.println("Doğru cevap");
        }else
            System.out.println(" Yanlış cevap");

    }

}
