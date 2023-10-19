package while_loop;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println("Number 252 - Sum of first and last digits is: " + sumFirstAndLastDigit(252));
        System.out.println("Number 257 - Sum of first and last digits is: " + sumFirstAndLastDigit(257));
        System.out.println("Number 0 - Sum of first and last digits is: " + sumFirstAndLastDigit(0));
        System.out.println("Number 5 - Sum of first and last digits is: " + sumFirstAndLastDigit(5));
        System.out.println("Number -10 - Sum of first and last digits is: " + sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = number % 10;
        int firstDigit = 0;

        // return -1 for negative values (invalid per instructions)
        if (number < 0) {
            return -1;
        }

        // for 1-digit numbers, assume the digit is both the first and the last digit and add together
        if (number < 10) {
            return number * 2;
        }

        while (number > 9) {
            number = number / 10;
        }
        firstDigit = number;
        return lastDigit + firstDigit;
    }
}
