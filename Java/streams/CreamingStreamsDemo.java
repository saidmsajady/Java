package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreamingStreamsDemo {
    public static void show() {

        // // Set amount of values
        // Stream.of(1, 2, 3, 4);

        // // Infinate Stream
        // var stream = Stream.generate(() -> Math.random());
        // stream
        //     .limit(3)
        //     .forEach(n -> System.out.println(n));
        //     // 0.1355723751419996
        //     // 0.13526902347501446
        //     // 0.3667264524856735

        // // Iterating ( Also Infinate with Unary)
        // Stream.iterate(1, n -> n + 1)
        //         .limit(10)
        //         .forEach(n -> System.out.println(n)); // 1-10

        // // Stream from a normal array
        // int[] numbers = {1, 2, 3};
        // Arrays.stream(numbers)
        //         .forEach(n -> System.out.println(n)); // 1-3

    }
}