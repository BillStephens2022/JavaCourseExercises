package while_loop;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of even digits of number 123456789: " + getEvenDigitSum(123456789));
        System.out.println("Sum of even digits of number 252: " + getEvenDigitSum(252));
        System.out.println("Sum of even digits of number -22: " + getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        int originalNumber = number;
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 9) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum = sum + lastDigit;
            }
            number = number / 10;
        }
        if (number % 2 == 0) {
            return sum + number;
        } else {
            return sum;
        }
    }
}
