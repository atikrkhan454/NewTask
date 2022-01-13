package movieList;

import java.util.ArrayList;
import java.util.Scanner;

public class AmazonPrime {

    public static void main(String[] args) {

        String choice = "y";
        Scanner sc = new Scanner(System.in);

        ArrayList<String> action = new ArrayList<>();
        action.add("Singham");
        action.add("Wanted");
        action.add("Ek Tha Tiger");
        action.add("Baaghi");
        action.add("Jai Ho");

        ArrayList<String> comedy = new ArrayList<>();
        comedy.add("Hera Pheri");
        comedy.add("Dhamaal");
        comedy.add("Bhagam Bhag");
        comedy.add("Dhol");
        comedy.add("Khatta Meetha");

        while (choice.equalsIgnoreCase("y")) {
            System.out.print("What category are you interested in?");

            String showMovielist = sc.nextLine();
            switch (showMovielist) {
                case "action" -> System.out.println(action);
                case "comedy" -> System.out.println(comedy);
            }
            System.out.print("Continue? y/n): ");
              choice = sc.next();
        }
    }
}
