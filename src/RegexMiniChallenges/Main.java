package RegexMiniChallenges;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Mini Challenge 1
        String sentence = "Hello, World!";
        boolean matches = sentence.matches("Hello, World!");
        System.out.println(matches);

        // Mini Challenge 2
//        String challenge2 = "[A-Z].*\\.";  //this works
        String challenge2 = "[A-Z][a-z\\s]+\\.";  // this also works but ensures 1 or more lowercase letter after the capital letter.

        for (String s : List.of("The bike is red.",
                "I am a new student.",
                "hello world.",
                "How are you?")) {
            boolean matched = s.matches(challenge2);
            System.out.println(matched + ": " + s);
        }

        // Mini Challenge 3
//        String challenge3 = "[A-Z].+[.?!]"; // this works
        String challenge3 = "^[A-Z][\\p{all}]+[.?!]$";  // this also works with anchor tags ^ and $

        for (String s : List.of("The bike is red, and has flat tires.",
                "I love being a new L.P.A. student!",
                "Hello, friends and family: Welcome!",
                "How are you, Mary?")) {
            boolean matched = s.matches(challenge3);
            System.out.println(matched + ": " + s);
        }


    }
}
