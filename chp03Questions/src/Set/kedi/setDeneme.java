package Set.kedi;

import java.util.*;

public class setDeneme {
    public static void main(String[] args) {

        Set<Kedi> hashSet = new HashSet<>();
        hashSet.add(new Kedi("Minnoş"));
        hashSet.add(new Kedi("Boncuk"));
        hashSet.add(new Kedi("Aslan"));
        System.out.println("HashSet: " + hashSet);


        Set<Kedi> linkedSet = new LinkedHashSet<>();
        linkedSet.add(new Kedi("Minnoş"));
        linkedSet.add(new Kedi("Boncuk"));
        linkedSet.add(new Kedi("Aslan"));
        System.out.println("LinkedHashSet: " + linkedSet);


        Set<Kedi> treeSet = new TreeSet<>();
        treeSet.add(new Kedi("Minnoş"));
        treeSet.add(new Kedi("Boncuk"));
        treeSet.add(new Kedi("Aslan"));
        System.out.println("TreeSet: " + treeSet);
    }
}
