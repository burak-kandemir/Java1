package CalisanlarProgrami;

public class Yonetici extends Calisan {
    private int sorumlu_kisi_sayisi;


    public Yonetici(String ad, int id, String soyad, int sorumlu_kisi_sayisi) {
        super(ad, id, soyad);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("yöneticinin sorumlu olduğu kişi sayısı : " + sorumlu_kisi_sayisi);
    }

    public void ZamYap(int ZamMiktarı) {
        System.out.println(getAd() + "çalışanlara " + ZamMiktarı + " kadar zam yapıyor..");
    }
}
