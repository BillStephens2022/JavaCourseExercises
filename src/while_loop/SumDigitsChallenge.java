package while_loop;

public class SumDigitsChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digits is: " + sumDigits(45));
        System.out.println("The sum of the digits is: " + sumDigits(76545));
        System.out.println("The sum of the digits is: " + sumDigits(-5322));
        System.out.println("The sum of the digits is: " + sumDigits(4));

    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while(number > 9) {
            sum += (number % 10);
            number = number / 10;
        }
        sum += number;
        return sum;
    }
}
