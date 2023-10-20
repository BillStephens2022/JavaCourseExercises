package while_loop;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6)); // true
        System.out.println(isPerfectNumber(28)); // true
        System.out.println(isPerfectNumber(5)); // false
        System.out.println(isPerfectNumber(-1)); // false, out of range

    }

    // checks if a number is a 'perfect number'.  i.e. the sum of its
    // factors (not including the number itself)
    // for example: factors of 6 (not including 6) are 1, 2, 3.  1 + 2 + 3 = 6, therefore it's a perfect #.
    // another example:  factors of 28 (not including 28) are 1, 2, 4, 7, 14.  1+2+4+7+14 = 28, perfect #!
    public static boolean isPerfectNumber(int num) {
        if (num < 1) {
            return false;
        }

        int i = 1;
        int sum = 0;
        while (i < num) {
            if (num % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum == num;

    }
}
