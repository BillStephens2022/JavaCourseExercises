package Arrays.ArrayCodingExercise;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public int[] getIntegers(int arraySize) {
        int[] userArray = new int[arraySize];
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter an Integer: ");
            userArray[i] = scanner1.nextInt();
        }
        return userArray;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
