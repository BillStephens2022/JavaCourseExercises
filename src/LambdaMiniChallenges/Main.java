package LambdaMiniChallenges;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
         // ************* MINI CHALLENGE 1 ***************************
        // split each word of a sentence out into a separate line
        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        // alternate way
        Consumer<String> printWordsLambdaForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        // another alternate way
        Consumer<String> printWordsConcise = sentence -> {
           Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };
        System.out.println("---------1st Method--------------");
        printWordsLambda.accept("A lazy brown fox jumped over the fence");
        System.out.println("---------2nd Method--------");
        printWordsLambdaForEach.accept("A lazy brown fox jumped over the fence");
        System.out.println("---------3rd Method--------");
        printWordsConcise.accept("A lazy brown fox jumped over the fence");

        // ************* MINI CHALLENGE 2 ***************************

        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(everySecondChar.apply("1234567890"));

        System.out.println(everySecondCharacter(everySecondChar, "0123456789"));

        Supplier<String> iLoveJava = () -> "I love Java!";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }

    public static String everySecondCharacter(Function<String, String> func, String source) {
        return func.apply(source);
    }
}
