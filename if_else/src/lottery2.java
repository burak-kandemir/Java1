import java.util.Scanner;

public class lottery2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random()*900)+100;
        int l1 = lottery/100;
        int lremaining =  lottery%100;
        int l2 =lremaining/10;
        lremaining %= 10;
        int l3 =lremaining;


        System.out.println("piyango için 3 haneli bir sayı giriniz");
        int number = input.nextInt();
        int d1 = number/100;
        int remaining = number%100;
        int d2 = number/10;
        remaining = number%10;
        int d3 = remaining;


        if(lottery == number){
            System.out.println("Tebrikler. Tam eşleşme 100.000 tl kazandınız");
        }else if((d1 == l1 || d1 == l2 || d1 == l3) &&
                (d2 == l1 || d2 == l2 || d2 == l3) &&
                (d3 == l1 || d3 == l2 || d3 == l3)){
            System.out.println(" Tebrikler. 3 rakamı da bildiniz. 10.000 tl kazandınız");

        }else if((d1 == l1 || d1 == l2 || d1 == l3) ||
                (d2 == l1 || d2 == l2 || d2 == l3) ||
                (d3 == l1 || d3 == l2 || d3 == l3)){
            System.out.println("Tebrikler. tek rakam bildiniz ve 1.000 tl kazandınız");
        }else {
            System.out.println("Maalesef bilemediniz ve bir şey kazanamadınız");
        }
        System.out.println(lottery + " piyango numarasıydı");

    }
}
