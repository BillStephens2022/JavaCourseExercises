package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // note we can use "Science Fiction" or "Science" or "S" because the getMovie method
        // looks at the first character of the type entered as a parameter to determine which
        // type of Movie to create

//        Movie theMovie = Movie.getMovie("Science Fiction", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}
