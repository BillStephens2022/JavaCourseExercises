package Arrays.ArrayMultiDimensional;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] array2 = new int [4][4];
        // assign second element in outer array to an array of 3 integers
        // note that you can directly assign array2[1] to {10, 20, 30} - must create the
        // new array with the 'new' keyword
        array2[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(array2));

        // creating a multi-dimensional array where each element has different dimensions
        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));
        anyArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));
        anyArray[1] = new String[][] {
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        for (Object element : anyArray) {
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}
