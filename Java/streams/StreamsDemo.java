package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void show() {

        List<Movie> movies = List.of(
            new Movie ("A", 10),
            new Movie ("B", 20),
            new Movie ("C", 30)
        );


        var result = movies.stream()
            .filter(m -> m.getLikes() > 10)
            .collect(Collectors.toList());

        System.out.println(result);



        // Optional<Integer> sum = movies.stream()
        //         .map(m -> m.getLikes())
        //         .reduce(Integer::sum); //(a, b) -> a + b
        //         // 60

        // System.out.println(sum.orElse(0));




        // movies.stream()
        //         .filter(m -> m.getLikes() > 10)
        //         .peek(m -> System.out.println("filtered: " + m.getTitle()))
        //         .map(Movie::getTitle) // m -> m.getTitle()
        //         .peek(t -> System.out.println("mapped: " + t))
        //         .forEach(System.out::println); // B, C

        /*
            filtered: B
            mapped: B
            B
            filtered: C
            mapped: C
            C
         */

        // movies.stream()
        //         .sorted(Comparator.comparing(Movie::getTitle))
        //         .forEach(m -> System.out.println(m.getTitle()));

        // movies.stream()
        //         .map(m -> m.getLikes())
        //         .forEach(like -> System.out.println(like));
        //         // A, B, C, D

        // // Same thing using method referencing
        // movies.stream()
        //         .map(Movie::getLikes)
        //         .distinct() // only gives unique values
        //         .forEach(System.out::println); // A, B, C
       

        // movies.stream()
        //         .limit(2)
        //         .forEach(m -> System.out.println(m.getTitle())); // A, B

        // movies.stream()
        //         .skip(2)
        //         .forEach(m -> System.out.println(m.getTitle())); // C

        // // 1000 Movies, 10 movies per page, 3rd page
        // Predicate<Movie> thirdPage = m -> m.getLikes() < 30;
        // movies.stream()
        //         .takeWhile(thirdPage)
        //         .forEach(m -> System.out.println(m.getTitle())); // A, B


        // Predicate<Movie> isPopular = m -> m.getLikes() > 10;

        // movies.stream()
        //     .filter(isPopular)
        //     .forEach(m -> System.out.println(m.getLikes()));

        // movies.stream()
        //     .map(movie -> movie.getTitle())
        //     // applies to every movie in the stream

        //     // Could also use '.mapToInt()' to get likes
        //     .forEach(name -> System.out.println(name)); // A, B, C

        // // FlatMap
        // var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        // stream
        //     .flatMap(list -> list.stream())
        //     .forEach(list -> System.out.println(list));
        // // flatmap flattens [1, 2, 3] [4, 5, 6] to -> 1, 2, 3, 4, 5, 6

    }
}
