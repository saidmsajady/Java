package collections;

import java.util.*;

public class SetDemo {

    public static void show() {

        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);
        // No Duplicates, but not in order also
        // [set, blue, is]

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c");
        Set<String> set1 = new HashSet<>(collection);
        System.out.println(set1);
        // No Duplicates
        // [a, b, c]

        Set<String> set2 = 
            new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> set3 = 
            new HashSet<>(Arrays.asList("B", "C", "D"));
        set2.addAll(set3);
        System.out.println(set2);
        // Union - Merge with no duplicates
        // [A, B, C, D]

        set2.retainAll(set3);
        System.out.println(set2);
        // Intersection - Only keep the values that have duplicates
        // [B, C]

        set2.removeAll(set3);
        System.out.println(set2);
        /*  Difference - Returns items in the first 
        set that are not in the second set */
        // [A]
    }   
}