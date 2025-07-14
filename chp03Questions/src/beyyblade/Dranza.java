package beyyblade;

public class Dranza extends Beyblade {
    private String kutsalCanavar;


    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("kutsal Canavar Adı : " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        super.kutsalCanavarOrtayaCikar();
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ortaya çıkarıyor.");
        System.out.println(getBeybladeci() + " ın saldırısı : Alev kılıcı");
    }

    public Dranza(String beybladeci, int donus_hizi, int saldiri_gucu, String  kutsalCanavar ) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;

    }
}
