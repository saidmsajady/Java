package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void show() {

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "!");

        list.set(1, "a"); // Replacing
        list.remove(2); 

        Collections.addAll(list, "A", "B", "C");

        System.out.println(list.get(0)); // "!"

        System.out.println(list.indexOf("a")); 
        // Return the index of the first "a" occurence
        // Also 'lastIndexOf' for the last "a" occurence

        for (var item : list)
            System.out.println(item);

        System.out.println();

    }
}
