package beyyblade;

public class BeybladeFabrikası {
    public Beyblade beybladeUret(String beyblade_turu) {
        if (beyblade_turu.equals("Dragon")) {
            return new Dragon("Takao", 800, 300, "mavi ejderha");
        } else if (beyblade_turu.equals("Dranza")) {
            return new Dranza("kai", 600, 300, "kırmızı anka kuşu");
        } else if (beyblade_turu.equals("Draciel")) {
            return new Dranza("max", 1000, 200, "yeşil kaplumbağa");
        } else if (beyblade_turu.equals("Drayga")) {
            return new Dranza("rei", 800, 250, "beyaz kaplan");
        } else
            return null;

    }
}
