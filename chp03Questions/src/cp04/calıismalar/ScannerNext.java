package cp04.calıismalar;

import java.util.Scanner;

public class ScannerNext {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("birbirinden ayrı 3 adet kelime giriniz");
        String kelime1 = input.next();
        String kelime2 = input.next();
        String kelime3 = input.next();

        System.out.println("ilk kelime : " + kelime1);
        System.out.println("ikinci kelime : " + kelime2);
        System.out.println("üçüncü kelime : " + kelime3);


        System.out.println("bir line giriniz");
        String line = input.nextLine();
        System.out.println("yazılan line : " + line);

    }
}
