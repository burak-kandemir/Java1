package cp05calismalar;

public class CarpimTablosu {
    public static void main(String[] args) {
        System.out.println("             Carpim Tablosu");

        for (int j = 1; j <= 9; j++) {
            System.out.printf("%4d" , j );
        }
        System.out.println("\n    --------------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j );
            }
            System.out.println();
        }
    }
}
