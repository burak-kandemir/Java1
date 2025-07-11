package oopIdman;

public class Idman {

    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int squat_sayisi, int burpee_sayisi, int pushup_sayisi, int situp_sayisi) {
        this.squat_sayisi = squat_sayisi;
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }
    public void HarketYap(String HareketTuru, int sayi){

        if( HareketTuru.equals("Burpee")){
            BurpeeYap(sayi);

        }else if( HareketTuru.equals("Pushup")){
            PushupYap(sayi);

        }else if( HareketTuru.equals("Situp")){
            SitupYap(sayi);
        }else if( HareketTuru.equals("Squat")){
            SquatYap(sayi);
        }else{
            System.out.println("yanlış girdi yaptınız");
        }
    }
    public void BurpeeYap(int sayi){
        if (burpee_sayisi==0){
            System.out.println("yapacak burpee kalmadı..");

        }else if(burpee_sayisi-sayi<0){
            System.out.println("Hedeflenen burpee sayısını geçtiniz.Tebrikler!");


        }else{
            burpee_sayisi -=sayi;
            System.out.println("kalan burpee sayısı : " + burpee_sayisi);
        }
    }
    public void PushupYap(int sayi){
        if (pushup_sayisi==0){
            System.out.println("yapacak pushup kalmadı..");

        }else if(pushup_sayisi-sayi<0){
            System.out.println("Hedeflenen pushup sayısını geçtiniz.Tebrikler!");


        }else{
            pushup_sayisi -=sayi;
            System.out.println("kalan pushup sayısı : " + pushup_sayisi);
        }
    }
    public void SitupYap(int sayi){
        if (situp_sayisi==0){
            System.out.println("yapacak situp kalmadı..");

        }else if(situp_sayisi-sayi<0){
            System.out.println("Hedeflenen situp sayısını geçtiniz.Tebrikler!");


        }else{
            situp_sayisi -=sayi;
            System.out.println("kalan situp sayısı : " + situp_sayisi);
        }
    }
    public void SquatYap(int sayi){
        if (squat_sayisi ==0){
            System.out.println("yapacak squat kalmadı..");

        }else if(squat_sayisi-sayi<0){
            System.out.println("Hedeflenen squat sayısını geçtiniz.Tebrikler!");


        }else{
            squat_sayisi -=sayi;
            System.out.println("kalan squat sayısı : " + squat_sayisi);
        }
    }
    public boolean idmanBittiMi(){
        return(burpee_sayisi==0 && situp_sayisi==0 && squat_sayisi==0 && pushup_sayisi==0);


    }
}