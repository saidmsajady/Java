package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {

    public static void show() {

        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");
        collection.add("D");

        Collections.addAll(collection, "E", "F", "G");

        for ( var item : collection)
            System.out.println(item);

        // collection.remove("A");
        // collection.clear();

        // var objectArray = collection.toArray();
        // var stringArray = collection.toArray(new String[0]);

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection.equals(other));
        // true
    }
}