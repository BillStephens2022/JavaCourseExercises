package methods;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21)); // 7
        System.out.println(getLargestPrime(217)); // 31
        System.out.println(getLargestPrime(0)); // -1
        System.out.println(getLargestPrime(45)); // 5
        System.out.println(getLargestPrime(-1)); // -1
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int largestFactor = 1;

        while (number % 2 == 0) {
            largestFactor = 2;
            number /= 2;
        }

        for (int i = 3; i <= number; i += 2) {
            while (number % i == 0) {
                largestFactor = i;
                number /= i;
            }
        }
        return largestFactor;
    }
}
