public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        double num1times1000 = num1 * 1000;
        double num2times1000 = num2 * 1000;
        int num1Int = (int) num1times1000;
        int num2Int = (int) num2times1000;
        return num1Int == num2Int;
    }
}
