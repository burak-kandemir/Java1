package Set.kedi;

class Kedi implements Comparable<Kedi> {
    String isim;

    public Kedi(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return isim;
    }

    @Override
    public int compareTo(Kedi o) {
        return this.isim.compareTo(o.isim); // TreeSet için lazım
    }
}
