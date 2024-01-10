package MathRandom;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int maxMinusFive = Integer.MAX_VALUE - 5;
//        for (int j = 0, id = maxMinusFive; j < 10; id = Math.incrementExact(id), j++) {
//            System.out.printf("Assigning id %,d%n", id);
//        }

        System.out.println(Math.abs(-50));
        System.out.println(Math.abs(Integer.MIN_VALUE));
//        System.out.println(Math.absExact(Integer.MIN_VALUE));
        System.out.println(Math.abs((long) Integer.MIN_VALUE));

        System.out.println("Max = " + Math.max(10, -10));
        System.out.println("Min = " + Math.min(10.00000002, 10.001f));

        System.out.println("Round Down = " + Math.round(10.2));
        System.out.println("Round Up = " + Math.round(10.8));
        System.out.println("Round ? = " + Math.round(10.5));

        System.out.println("Floor = " + Math.floor(10.8));
        System.out.println("Ceil = " + Math.ceil(10.2));

        System.out.println("Square root of 100 = " + Math.sqrt(100));
        System.out.println("10 to the fifth power = " + Math.pow(10, 5));

        // picks a random character in the Alphabet
        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d = %1$c%n", (int) (Math.random() * 26) + 65);
        }

        System.out.println("---------------------------------------");
        // Note this does the same as above picking a random character in the Alphabet
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d = %1$c%n", r.nextInt(65, 91));
        }

        // Does same as above, note that 1 is added to the 'Z' bound since the bound is exclusive.
        System.out.println("---------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d = %1$c%n",
                    r.nextInt((int) 'A', (int) 'Z' + 1));
        }

        System.out.println("---------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d%n", r.nextInt(-10, 11));
        }

//        .ints() creates a random stream of integers
        System.out.println("---------------------------------------");
        r.ints()  // without bounds specified
                .limit(10)
                .forEach(System.out::println);

        System.out.println("---------------------------------------");
        r.ints(0 ,10) // with bounds
                .limit(10)
                .forEach(System.out::println);

        // note that a stream size  can be passed in (so no need for .limit, as in above)
        System.out.println("---------------------------------------");
        r.ints(10, 0 ,10) // with bounds
                .forEach(System.out::println);

        // single argument passed to .ints
        System.out.println("---------------------------------------");
        r.ints(10) // single argument, no bounds specified
                .forEach(System.out::println);

        long nanoTime = System.nanoTime();
        Random pseudoRandom = new Random(nanoTime);
        System.out.println("---------------------------------------");
        pseudoRandom.ints(10, 0, 10)
                .forEach(i -> System.out.print(i + " "));

        Random notReallyRandom = new Random(nanoTime);
        System.out.println("\n---------------------------------------");
        notReallyRandom.ints(10, 0, 10)
                .forEach(i -> System.out.print(i + " "));


    }
}
