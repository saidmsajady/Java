package lambdaandfunctionalinterfaces;

import java.util.*;
import java.util.function.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class LambdasDemo {
    public static void show() {




        // a, b -> a + b -> square
        BinaryOperator<Integer> add = (a, b) -> a + b;
        Function<Integer, Integer> square = a -> a * a;

        var result = add.andThen(square).apply(1, 2); // 9



    
        // // Mainly used to filter data

        // Predicate<String> isLongerThan5 = str -> str.length() > 5;
        // isLongerThan5.test("Sky"); // False

        // Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        // Predicate<String> hasRightBrace = str -> str.endsWith("}");

        // hasLeftBrace.or(hasRightBrace); // true

        // Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);

        // var result = hasLeftAndRightBraces.test("{Key:Value}"); // true





        // Function<String, Integer> map = str -> str.length();
        // var length = map.apply("Sky");
        // System.out.println(length); // 3

        // // Key:Value
        // // First: "Key=Value"
        // // Second: "{Key=Value}"
        // Function<String, String> replaceColon = str -> str.replace(":", "=");
        // Function<String, String> addBraces = str -> "{" + str + "}";

        // var result = replaceColon
        //                 .andThen(addBraces)     
        //                 .apply("Key:Value");
        // System.out.println(result); // {Key=Value}





    // // Supplier has speciaizers for primitive values
    // Supplier<Double> getRandom = () -> Math.random(); 
    // var random = getRandom.get();
    // System.out.println(random);

        // Consumer
 
    // List<Integer> list = List.of(1, 2, 3);

    // // Imparative Programming (for, if/else, switch)
    // // How it should be done
    // for (var item : list)
    //     System.out.println(item);

    // // Declaritive Programming
    // // What should be done
    // list.forEach(item -> System.out.println(item));

    // // Chaining Consumers
    // List<String> list1 = List.of("a", "b", "c");
    // Consumer<String> print = item -> System.out.println(item);
    // Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

    // list1.forEach(print.andThen(printUpperCase).andThen(print));

    }
}
