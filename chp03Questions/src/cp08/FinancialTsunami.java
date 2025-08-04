package cp08;

import java.util.*;

public class FinancialTsunami {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("banka sayısı : ");
        int n = in.nextInt();
        System.out.println("limit : ");
        int limit = in.nextInt();

        double[] varlik = new double[n];
        double[][] borc = new double[n][n];

        for (int i = 0; i < n; i++) {
            System.out.println("banka " + i + "için giriş : ");
            System.out.println("kendi varlığı : ");
            varlik[i] = in.nextDouble();
            System.out.println("borç verdiği banka sayısı : ");
            int borcSayisi = in.nextInt();

            for (int j = 0; j < borcSayisi; j++) {
                int borclu = in.nextInt();
                double miktar = in.nextDouble();
                borc[i][borclu] = miktar;
            }
        }
        boolean[] isSafe = new boolean[n];
        Arrays.fill(isSafe, true);

        boolean changed;
        do {
            changed = false;

            for (int i = 0; i < n; i++) {
                if (!isSafe[i]) continue;

                double totalAssets = varlik[i];

                for (int j = 0; j < n; j++) {
                    if (isSafe[j]) {
                        totalAssets += borc[i][j];
                    }
                }

                if (totalAssets < limit) {
                    isSafe[i] = false;
                    changed = true;
                }
            }
        } while (changed);

        // Unsafe bankaları yazdır
        System.out.print("UNSAFE bankalar: ");
        for (int i = 0; i < n; i++) {
            if (!isSafe[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
