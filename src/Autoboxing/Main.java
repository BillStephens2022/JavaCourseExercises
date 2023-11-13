package Autoboxing;

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
    }
    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.0;
    }

}
