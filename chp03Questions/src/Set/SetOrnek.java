package Set;

import  java.util.*;

interface Canli {
    void sesCikar();
}

class Kedi implements Canli {
    @Override
    public void sesCikar() {
        System.out.println("Miyav!");
    }
}
class Kaplan extends Kedi {
    @Override
    public void sesCikar() {
        System.out.println("Rooaaar!");
    }
}

public class SetOrnek {
    public static void main(String[] args) {

        Set<Canli> hayvanlar = new HashSet<>();

        hayvanlar.add(new Kedi());
        hayvanlar.add(new Kaplan());
        hayvanlar.add(new Kedi());

        for (Canli h : hayvanlar) {
            h.sesCikar();
        }
    }
}