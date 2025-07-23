package cp07Questions;


public class LockerPuzzle {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        for (int ogrenci = 1; ogrenci <= 100; ogrenci++) {
            for (int dolap = ogrenci; dolap <= 100; dolap += ogrenci) {
                lockers[dolap - 1] = !lockers[dolap - 1];
            }
        }

        System.out.println("Açık kalan dolap numaraları:");
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print((i + 1) + " ");
            }
        }

    }
}
