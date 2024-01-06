package StreamsIntermediate;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        IntStream.iterate((int) 'A', i -> i <= (int) 'z', i -> i + 1)
                // filters out symbols in range
                .filter(Character::isAlphabetic)
                // filters out letters A thru E
                // .filter(i -> Character.toUpperCase(i) > 'E')
                // also filters out letters A thru E using numerical equivalent
                // .skip(5)
                // also filters out letters A thru E - but notice that dropWhile
                // only works on the first set of A thru E.  dropWhile works
                // until the predicate returns false the first time.
                // .dropWhile(i -> Character.toUpperCase(i) <= 'E')
                // only takes the characters before lower case 'a'
                // .takeWhile(i -> i < 'a')
                .map(Character::toUpperCase)
                // removes duplicates
                .distinct()
                .forEach(d -> System.out.printf("%c ", d));

        System.out.println();
        Random random = new Random();
        Stream.generate(() -> random.nextInt((int)'A', (int)'Z' + 1))
                .limit(50)
                .distinct()
                .sorted()
                .forEach(d -> System.out.printf("%c ", d));

    }
}
