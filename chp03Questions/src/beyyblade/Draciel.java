package beyyblade;

public class Draciel extends Beyblade {
    private String kutsalCanavar;

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();

    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        super.kutsalCanavarOrtayaCikar();
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ortaya çıkarıyor.");
        System.out.println(getBeybladeci() + " ın saldırısı : kale savunması");
    }

    public Draciel(String beybladeci, int donus_hizi, int saldiri_gucu, String kutsalCanavar) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
    }
}
