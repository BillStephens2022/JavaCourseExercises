package Arrays.ArrayCodingExercise;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortedArray arrayObj = new SortedArray();
        int[] unsortedArray = arrayObj.getIntegers(5);
        arrayObj.printArray(unsortedArray);
        int[] sortedArrayDescending = arrayObj.sortIntegers(unsortedArray);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArrayDescending));
    }
}
