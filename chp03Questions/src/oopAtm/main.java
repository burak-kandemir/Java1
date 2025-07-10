package oopAtm;


public class main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Hesap hesap = new Hesap(2000, "burak kandemir", "12345");
        atm.calis(hesap);
        System.out.println("programdan çıkılıyor...");

    }
}



