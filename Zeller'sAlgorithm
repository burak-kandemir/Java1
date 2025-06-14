import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("yılı giriniz ( örn: 2012)");
        int yil = input.nextInt();
        System.out.println("ayı giriniz (örn: ocak için 1 ... aralık için 12)");
        int ay = input.nextInt();
        System.out.println("ayın gününü giriniz ( 1-31) ");
        int gun = input.nextInt();

        int j =yil/100;
        int k = yil%100;

        int istenenGun = (gun+(26*(ay + 1))/10 + k + (k/4)+(j/4)+(j*5))%7;

        switch (istenenGun) {
            case 0 :
                System.out.println("cumartesi");
                break;
            case 1:
                System.out.println("pazar");
                break;
                case 2:
                    System.out.println("pazartesi");
                    break;
                    case 3:
                    System.out.println("salı");
                    break;
                    case 4:
                    System.out.println("çarşamba");
                    break;
                    case 5:
                    System.out.println("perşembe");
                    break;
                    case 6:
                    System.out.println("cuma");
                    break;

        }

    }
}
