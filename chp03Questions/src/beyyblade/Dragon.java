package beyyblade;

public class Dragon extends Beyblade{
    private String kutsalCanavar;

    public Dragon(String beybladeci, int donus_hizi, int saldiri_gucu, String kutsalCanavar) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ortaya çıkarıyor.");
        System.out.println(getBeybladeci() + " ın saldırısı : hayalet kasırga");
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        super.kutsalCanavarOrtayaCikar();
        System.out.println("Kutsal Canavar adı : " + kutsalCanavar);
    }

}
