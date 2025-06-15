import java.util.Scanner;

public class FutureDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("hangi günde olduğunuzu giriniz (örn: pazar için 0  ... cumartesi için 6 ");
        int today = input.nextInt();
        System.out.println("kaç gün sonrasını öğrenmek istiyorsunuz ");
        int elapsedDay = input.nextInt();

        int futureDay = ( today + elapsedDay ) % 7 ;
        System.out.println("bugün günlerden : ");
        switch (today) {
            case 0:
                System.out.println("pazar");
                break;
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
        }

        System.out.println(" öğrenmek istediğiniz gün : ");
       switch (futureDay) {
           case 0:
               System.out.println("pazar");
               break;
           case 1:
               System.out.println("pazartesi");
               break;
           case 2:
               System.out.println("salı");
               break;
           case 3:
               System.out.println("çarşamba");
               break;
           case 4:
               System.out.println("perşembe");
               break;
           case 5:
               System.out.println("cuma");
               break;
           case 6:
               System.out.println("cumartesi");
               break;
       }



        }



    }

