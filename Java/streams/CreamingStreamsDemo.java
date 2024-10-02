package streams;

import java.util.Arrays;

public class CreamingStreamsDemo {
    public static void show() {

        int[] numbers = {1, 2, 3};
        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n));

    }
}