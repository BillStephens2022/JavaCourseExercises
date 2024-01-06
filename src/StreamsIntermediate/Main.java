package StreamsIntermediate;

import java.util.Comparator;
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
        Stream.generate(() -> random.nextInt((int) 'A', (int) 'Z' + 1))
                .limit(50)
                .distinct()
                .sorted()
                .forEach(d -> System.out.printf("%c ", d));

        System.out.println();
        int maxSeats = 100;
        int seatsInRow = 10;
        var stream = Stream.iterate(0, i -> i < maxSeats, i -> i + 1)
                .map(i -> new Seat((char) ('A' + i / seatsInRow),
                        i % seatsInRow + 1))
                .skip(5)
                .limit(10)
                .peek(s -> System.out.println("--> " + s))
                        .sorted(Comparator.comparing(Seat::price)
                                .thenComparing(Seat::toString));
//                .mapToDouble(Seat::price)
//                .boxed()
//                .map("%.2f"::formatted);
        stream.forEach(System.out::println);

    }
}
