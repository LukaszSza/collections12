package pl.sda.lukasz;

import com.sun.glass.ui.Size;

import java.util.*;


public class SetOperations {
    //    private static final SizeComparator SIZECOMPARATOR = new SizeComparator();
    public static void main(String[] args) {

        System.out.println("------HasSet------");
        Set<String> set = new HashSet<String>();
        fillSet(set);
        showSet(set);

        System.out.println("------TreeSet-----");
        Set<String> set2 = new TreeSet<String>(new SizeComparator());
        fillSet(set2);
        showSet(set2);

        System.out.println("---LinkedHashSet--");
        Set<String> set3 = new LinkedHashSet<String>();
        fillSet(set3);
        showSet(set3);


    }

    private static void showSet(Set<String> set) {
        for (String x : set) {
            System.out.println(x);
        }
    }

    private static void fillSet(Set<String> set) {
        set.add("Adam");
        set.add("Beata");
        set.add("Celina");
        set.add("Dariusz");
        set.add("Eliza");
        set.add("Franciszek");
    }


}
