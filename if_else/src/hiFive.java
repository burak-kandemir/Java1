import java.util.Scanner;

public class hiFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz ");
        int sayi1 = input.nextInt();
        if (sayi1 % 5 ==0) {
            System.out.println("hi five");
        }
            if (sayi1 % 2 ==0){
                System.out.println("hi even");
            }
            else  {
                System.out.println("hi odd");
            }

    }
}
