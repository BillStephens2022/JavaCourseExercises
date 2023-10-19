package while_loop;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println("Is 45 a Palindrome? " + isPalindrome(45));
        System.out.println("Is 1221 a Palindrome? " + isPalindrome(1221));
        System.out.println("Is -1221 a Palindrome? " + isPalindrome(-1221));
        System.out.println("Is 34543 a Palindrome? " + isPalindrome(34543));
    }

    public static boolean isPalindrome(int number) {    //45
        int originalNumber = number;
        if (number < 0) {
            number = number * -1;
        }
        int reverseNumber = 0; // reverseNumber = 0

        while(number > 9) {
            int lastDigit = number % 10; // lastDigit = 5
            reverseNumber += lastDigit; // reverseNumber = 5
            reverseNumber = reverseNumber * 10; // reverseNumber = 50;
            number = number / 10; // number = 4

        }
        reverseNumber = reverseNumber + number; // reverseNumber = 54

        if (originalNumber < 0) {
            reverseNumber = reverseNumber * -1;
        }

        return (originalNumber == reverseNumber);
    }
}
