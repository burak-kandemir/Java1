package cp06Calismalar;

public class AsalSayi {
    public static boolean asalMi(int sayi) {
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int sayac = 0;
        for (int i = 2; i < 1000; i++) {
            if (asalMi(i)) {
                System.out.printf("%4d", i);
                if (sayac % 10 == 0) {
                    System.out.println();

                }
                sayac++;
            }
        }

    }
}
