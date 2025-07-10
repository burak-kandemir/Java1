package oopAtm;

public class Hesap {
    private String kullanici_adi;
    private String kullanici_password;
    private int bakiye;


    public Hesap(int bakiye, String kullanici_adi, String kullanici_password) {
        this.kullanici_adi = kullanici_adi;
        this.kullanici_password = kullanici_password;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getKullanici_password() {
        return kullanici_password;
    }

    public void setKullanici_password(String kullanici_password) {
        this.kullanici_password = kullanici_password;
    }

    public void ParaYatir(int tutar) {
        bakiye += tutar;
        System.out.println("yeni bakiyeniz : " + bakiye);
    }

    public void ParaCek(int tutar) {
        if (tutar > bakiye) {
            System.out.println("yeterli bakiyeniz bulunmamaktadır.");
        } else {
            bakiye -= tutar;
            System.out.println("yeni bakiyeniz : " + bakiye);
        }
    }
}
