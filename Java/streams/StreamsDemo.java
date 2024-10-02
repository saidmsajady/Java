package streams;

import java.util.List;

public class StreamsDemo {
    public static void show() {

        List<Movie> movies = List.of(
            new Movie ("A", 10),
            new Movie ("B", 15),
            new Movie ("C", 20)
        );

        movies.stream()
                .map(movie -> movie.getTitle())
                .forEach(name -> System.out.println(name));

        // // Imperative Programming
        // int count = 0;
        // for ( var movie : movies ) {
        //     if (movie.getLikes() > 10)
        //         count ++;
        // }

        // // Declaritive (Functional) Programming
        // var count2 = movies.stream() 
        //     .filter(movie -> movie.getLikes() > 10)
        //     .count();
        

    }
}
