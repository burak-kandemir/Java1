package CalisanlarProgrami;

public class Yazilimci extends Calisan{
    private String diller;
    public Yazilimci(String ad, int id, String soyad,  String diller) {
        super(ad, id, soyad);
        this.diller = diller;
    }
    public void formatAt(String isletim_sistemi){
        System.out.println(getAd() + " " +  isletim_sistemi + " yüklüyor..." );
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("yazılımcının bildiği diller : " + diller);


    }
}
