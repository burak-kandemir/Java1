package SarkıcıProjesi;

import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkici_listesi = new ArrayList<>();
    public void sarkicilari_bastir(){
        System.out.println("Şarkıcı listesinde" + sarkici_listesi.size() + " kadar şarkıcı var.");

        for (int i = 0; i < sarkici_listesi.size(); i++) {
            System.out.println((i+1) + ". Şarkıcı: " + sarkici_listesi.get(i));
        }

    }
    public void sarkici_ekle (String isim){
        sarkici_listesi.add(isim);
        System.out.println("şarkıcı listesi güncellendi");
    }
    public void sarkici_guncelle(String yeni_isim, int pozisyon){
        sarkici_listesi.set(pozisyon, yeni_isim);
        System.out.println("şarkıcı listesi güncellendi");

    }public void sarkici_sil(int pozisyon){
        String isim = sarkici_listesi.get(pozisyon);
        sarkici_listesi.remove(pozisyon);
        System.out.println(isim + " isimli şarkıcı listeden çıkartıldı.");
    }
    public void sarkici_ara(String sarkici_ismi){
        int pozisyon = sarkici_listesi.indexOf(sarkici_ismi);
        if (pozisyon >= 0) {
            System.out.println("şarkıcı bulundu");
            System.out.println(sarkici_ismi + "isili şarkıcı " + (pozisyon+1) + "pozisyonunda");

        }
    }

}
