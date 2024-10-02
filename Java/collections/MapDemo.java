package collections;

import java.util.*;

public class MapDemo {

    public static void show() {

        // Key, Value. Not Iterable with ForEach!

        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        var unknown = new Customer ("Unknown", "");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        var customer = map.getOrDefault("e1", unknown);
        System.out.println(customer); // a // fast!!

        var exists = map.containsKey("e10");
        System.out.println(exists); // false

        map.replace("e1", new Customer("a++", "e1"));
        System.out.println(map); // {e1=a++, e2=b}

        // Iterating!
        for (var entry : map.entrySet())
            System.out.println(entry);

    }
    
}
