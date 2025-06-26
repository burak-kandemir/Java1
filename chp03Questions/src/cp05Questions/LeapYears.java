package cp05Questions;

public class LeapYears {
    public static void main(String[] args) {
       boolean artikYil = true;
       int sayac = 0;
        System.out.println("ARTIK YILLAR");

        for (int i = 101; i <= 2100; i++) {
            artikYil = (i % 4 == 0 && i %100 !=0) || (i % 400 == 0);
            if (artikYil) {
                sayac++;
                System.out.print(i + (sayac % 10 == 0 ? "\n" : " "));
            }

        } System.out.println();

    }
}
