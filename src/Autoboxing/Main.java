package Autoboxing;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15); // deprecated since JDK 9
        int unboxedInt = boxedInt.intValue(); // unnecessary

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
        // below won't compile, can't getClass method on a primitive type
       // System.out.println((autoUnboxed.getClass().getName()));

        // gets a primitive and converts it to a Boxed variable by
        // assigning it to the wrapper class Double
        // uses "Auto-boxing"
        Double resultBoxed = getLiteralDoublePrimitive();
        // gets a boxed variable and converts it to a primitive type by
        // assigning it to the primitive "double" type
        // uses "Auto-unboxing"
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println((wrapperArray[0].getClass().getName())); // java.lang.Integer

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getList(1, 2, 3, 4, 5);
        System.out.println(ourList);
    }
    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.0;
    }

    // unboxes an Integer to primitive type integer
    private static int returnAnInt(Integer i) {
        return i;
    }

    // boxes an integer primitive type to an object of the wrapper Integer class
    private static Integer returnAnInteger(int i) {
        return i;
    }

    // note that we could also use varargs as an "Integer" type as well instead of "int"
    // that would work as well.
    private static ArrayList<Integer> getList(int... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }

}
