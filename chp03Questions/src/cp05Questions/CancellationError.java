package cp05Questions;

public class CancellationError {
    public static void main(String[] args) {

        int n = 50000;
        double toplamSoldanSaga = 0;
        for (double i = 1; i <= n; i++) {
            toplamSoldanSaga += (1/i);

        }
        System.out.println("Soldan sağa toplam" + (toplamSoldanSaga));
double toplamSagdanSola = 0;
        for (double i = n; i >= 1; i--) {
toplamSagdanSola += (1/i);

}
        System.out.println("sağdan sola toplam" + ((toplamSagdanSola)));
        System.out.println("sağdan sola doğru serinin toplamı - "
                + "soldan sağa terimin toplamı: "
                + (toplamSagdanSola - toplamSoldanSaga));

    }
}
