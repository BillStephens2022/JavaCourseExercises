package while_loop;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Greatest common divisor of 25 & 15: " + getGreatestCommonDivisor(25, 15)); // 5
        System.out.println("Greatest common divisor of 12 & 30: " + getGreatestCommonDivisor(12, 30)); // 6
        System.out.println("Greatest common divisor of 9 & 18: " + getGreatestCommonDivisor(9, 18)); // -1 since invalid value, 9 out of range (i.e. < 10)
        System.out.println("Greatest common divisor of 81 & 153: " + getGreatestCommonDivisor(81, 153)); // 9
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        if (first == second) {
            return first;
        }

        int i = Integer.min(first, second);

        while (i > 0) {
            if ((first % i == 0) && (second % i == 0)) {
                return i;
            } else {
                i--;
            }

        }
        return 1;
    }
}
