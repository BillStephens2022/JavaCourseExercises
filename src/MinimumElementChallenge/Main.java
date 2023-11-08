package MinimumElementChallenge;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] numbers = readIntegers();
        System.out.println("Integer Array: " + Arrays.toString(numbers));
        int minNumber = findMin(numbers);
        System.out.println("Minimum # in the Array: " + minNumber);

    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of numbers separated by commas: ");
        String numbersString = scanner.nextLine();
        String[] sArray = numbersString.split(",");
        int[] intArray = new int[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            // note:  added .trim() in case user enters the numbers with spaces
            // (i.e. if user enters 1, 3, 5 - with spaces after the commas)
            intArray[i] = Integer.parseInt(sArray[i].trim());
        }
        return intArray;

    }

    private static int findMin(int[] intArray) {
        int min = intArray[0];

        // using a regular for loop
//        for (int i = 0; i < intArray.length - 1; i++) {
//            if (min > intArray[i + 1]) {
//                min = intArray[i + 1];
//            }
//        }

        // Alternative syntax - for each num in numArray - does same as above:
        for (int num : intArray) {
            if (min > num) {
                min = num;
            }
        }

        return min;
    }
}
