package DogumGunu;

public class DogumGunu {
    private String isim;
    private int gun;
    private int ay;
    private int yil;

    public int getAy() {
        return ay;
    }

    public void setAy(int ay) {
        this.ay = ay;
    }

    public int getGun() {
        return gun;
    }

    public void setGun(int gun) {
        this.gun = gun;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public DogumGunu(int ay, int gun, String isim, int yil) {
        this.ay = ay;
        this.gun = gun;
        this.isim = isim;
        this.yil = yil;
    }

    public int calculateAge() {
        java.util.GregorianCalendar today = new java.util.GregorianCalendar();
        int currentYear = today.get(java.util.Calendar.YEAR);
        return currentYear - yil;
    }

    // Bilgiyi string olarak döndür
    public String toString() {
        return isim + "'in doğum günü: " + gun + "/" + ay + "/" + yil + " → Yaş: " + calculateAge();
    }
}