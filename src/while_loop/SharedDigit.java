package while_loop;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println("Do 12 & 23 have a shared digit? " + hasSharedDigit(12, 23)); // true
        System.out.println("Do 9 & 99 have a shared digit? " + hasSharedDigit(9, 99));  // false - single digit number is invalid
        System.out.println("Do 15 & 55 have a shared digit? " + hasSharedDigit(15, 55)); // true
        System.out.println("Do 15 & 74 have a shared digit? " + hasSharedDigit(15, 74)); // false
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 > 99) || (num1 < 10) || (num2 > 99) || (num2 < 10)) {
            return false;
        }

        int firstDigit1 = num1 / 10;
        int firstDigit2 = num2 / 10;
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;

        return (firstDigit1 == firstDigit2) || (firstDigit1 == lastDigit2) || (lastDigit1 == firstDigit2) || (lastDigit1 == lastDigit2);


    }
}
