package ArrayReferences;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        anotherArray[0] = 1;
        // note that changing anotherArray also changes myIntArray
        // this is because we assigned the myIntArray object (created with the 'new' keyword)
        // to the variable, another array.  anotherArray is not a 'new' object - it wasn't created
        // with the 'new' keyword.  Now we have 2 variables pointing to the same object.
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        myIntArray[1] = 16;
       // same thing happens when we change the myIntArray instead since both array variables
        // are pointing to the same object in memory
        System.out.println("after 2nd change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after 2nd change anotherArray = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);
        // same thing happens when modifying one variable via a function, both array variables
        // are pointing to the same object
        System.out.println("after 3rd change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after 3rd change anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[2] = 42;
    }
}
