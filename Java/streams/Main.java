package streams;

public class Main {

    public static void main(String[] args) {

        StreamsDemo.show();
        CreamingStreamsDemo.show();
        
        // List<Movie> movies = List.of(
        //     new Movie ("A", 10),
        //     new Movie ("B", 15),
        //     new Movie ("C", 20)
        // );

        // movies.stream() 
        //     .takeWhile(m -> m.getLikes() < 20)
        //     .forEach(movie -> System.out.println(movie.getTitle()));

        // Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;

        // movies.stream()
        //     .filter(isPopular)
        //     .forEach(movie -> System.out.println(movie.getTitle()));

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
        
        // int[] numbers = {1, 2, 3};
        // Arrays.stream(numbers)
        //         .forEach(n -> System.out.println(n));

        // movies.stream()
        // .map(movie -> movie.getTitle())
        // .forEach(name -> System.out.println(name));

        
        /* Flattening an List */
        // var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        
        // stream
        //     .flatMap(list -> list.stream())
        //     .forEach(n -> System.out.println(n));

    }
    
}
