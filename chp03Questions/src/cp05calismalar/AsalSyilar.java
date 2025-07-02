package cp05calismalar;

public class AsalSyilar {
    public static void main(String[] args) {
        int NOP = 50;
        int per_line = 10;
        int sayac = 0;
        int sayi = 2;

        while (sayac < NOP) {
            boolean isprime = true;

            for (int bölünen = 2; bölünen <= sayi / 2; bölünen++) {
                if (sayi % bölünen == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                sayac++;
                if (sayac % per_line == 0) {
                    System.out.println(sayi);
                } else {
                    System.out.print(sayi + " ");
                }
            }
            sayi++;
        }
    }

}

