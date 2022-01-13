package showMovie;

import java.util.Scanner;

public class PrintMovie {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String title = null;
        String category = null;

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            System.out.println("What category are you interested in?");
            Movie newMovie = new Movie(title,category);
            category = sc.nextLine().toLowerCase();
            newMovie.setCategory(category);

            //System.out.println(PrimeList.getMovies(category));
            for(Movie movie:PrimeList.getMovies(category)){
                System.out.println(movie);
            }

            System.out.println("Would you like to continue? (y/n)");
            choice = sc.nextLine();
        }

        sc.close();
    }
}
