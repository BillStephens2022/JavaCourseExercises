package Arrays.ArrayTwoDimensional;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] array2 = new int [4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }


        // print out each element in each nested array - requires 2 loops,
        // 1 to loop through outer array, and 1 to loop through the inner arrays.
        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < array2.length; j++) {
                System.out.print(array2[i][i] + " ");
            }
            System.out.println();
        }


        // using enhanced for loop
        System.out.println("**********Enhanced For Loop**********************");
        for (var outer : array2) {
            for (var element : outer) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("*************************************************");

        // Using Arrays.deepToString method
        System.out.println("****Arrays.deepToString Method*******************");
        System.out.println(Arrays.deepToString(array2));
        System.out.println("*************************************************");

       System.out.println("****assigning new values to each element in 2 dimensional array**********");
        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < array2.length; j++) {
                array2[i][j] = (i * 10) + (j + 1);
            }
        }
        System.out.println(Arrays.deepToString(array2));
        System.out.println("*************************************************");
    }
}
