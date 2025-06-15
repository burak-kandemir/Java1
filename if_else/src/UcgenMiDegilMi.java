import java.util.Scanner;

public class UcgenMiDegilMi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını giriniz");
        int kenar1 = input.nextInt();
        int kenar2 = input.nextInt();
        int kenar3 = input.nextInt();

        if (kenar1+kenar2>kenar3 && kenar1+kenar3>kenar2 && kenar2+kenar3>kenar1){
            System.out.println("bu bir üçgendir.");

        }else{
            System.out.println("bu bir üçgen değildir.");
        }
    }
}
