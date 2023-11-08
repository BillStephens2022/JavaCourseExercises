package ReverseArrayChallenge;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5};
        int[] reversedNumArray = reverseArray(numArray);
        System.out.println("Reverse Array Method 1: " + Arrays.toString(reversedNumArray));

        int[] reversedNumArray2 = reverseArray2(numArray);
        System.out.println("Reverse Array Method 2: " + Arrays.toString(reversedNumArray));

        System.out.println("REVERSE ARRAY 3: ");
        reverseArray3(numArray);
    }

    // 3 methodologies for reversing an array.  1 & 2 are basically the same just different
    // syntax for the for loop.  3rd method is most efficient.

    private static int[] reverseArray(int[] intArray) {
        int[] reversedArray = new int[intArray.length];
        int count = 0;
        for (int i = (intArray.length-1); i >= 0; i--)  {
            reversedArray[count] = intArray[i];
            count++;
        }
        return reversedArray;
    }

    // same method as above, but different syntax for the for loop
  private static int[] reverseArray2(int[] intArray) {
        int[] reversedArray = new int[intArray.length];
        int maxIndex = intArray.length - 1;
        for (int num : intArray) {
            reversedArray[maxIndex--] = num;
        }
        return reversedArray;
    }

    // Another way of doing, most efficient, even though more lines of code.
    // This is done by swapping first element with last element and then working
    // inward until you get to center of the array.  Doing it this way there are
    // actually less operations that the computer has to perform.
    private static void reverseArray3(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("--> " + Arrays.toString(array));
        }

    }
}
