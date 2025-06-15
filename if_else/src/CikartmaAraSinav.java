import java.util.Scanner;

public class CikartmaAraSinav {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi1 = (int) (Math.random()*100);
         int sayi2 = (int) (Math.random()*100);
         int temp = 0;
         if (sayi1<sayi2){
             temp = sayi2;
             sayi2 = sayi1;
             sayi1 = temp;
         }
        System.out.println(sayi1 + " - " +  sayi2 + " = ?");
         int sonuc = input.nextInt();
         if (sayi1 - sayi2 == sonuc){
             System.out.println(" tebrikler doğru cevap ");

         }else
             System.out.println(" yanlış cevap. Doğru cevap :" + (sayi1 - sayi2));

    }
}
