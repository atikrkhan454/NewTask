package showMovie;

import java.util.ArrayList;

public class PrimeList {


    private static final ArrayList<Movie> allMovies = new ArrayList<>(4);

    public static ArrayList<Movie> getAllMovies() {
        allMovies.add(new Movie("Bhagam Bhag", "comedy"));
        allMovies.add(new Movie("Dhol", "comedy"));
        allMovies.add(new Movie("Wanted", "action"));
        allMovies.add(new Movie("Dhoom 3", "action"));

        return allMovies;
    }

      public static ArrayList<Movie> getMovies(String category) {
        if (allMovies.isEmpty()) {
            getAllMovies();
        }

        ArrayList<Movie> movies = new ArrayList<>();
        if (category == null) {
            return movies;
        }

        for (Movie movie : allMovies) {
            if (movie.getCategory().equals(category)) {
                movies.add(movie);
            }
        }

        return movies;
    }
}