package CalisanlarProgrami;

public class Calisan {
    private String ad;
    private String soyad;
    private int id;

    public Calisan(String ad, int id, String soyad) {
        this.ad = ad;
        this.id = id;
        this.soyad = soyad;

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public void bilgileriGoster(){
        System.out.println("ÇALIŞAN BİLGİLERİ");
        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + soyad);
        System.out.println("id : " + id);
    }
}
