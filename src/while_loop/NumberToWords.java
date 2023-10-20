package while_loop;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println("Digit Counts:");
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println("Reverse Numbers:");
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println("Number to Words:");
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
        }

        int digitCount = getDigitCount(number);
        int reversedNumber = reverse(number);
        int zeroCount = digitCount - getDigitCount(reversedNumber);

        while (reversedNumber > 0) {
            int digit = reversedNumber % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversedNumber = reversedNumber / 10;
        }



        if (zeroCount > 0) {
            for (int i = 0; i < zeroCount; i++) {
                System.out.println("Zero");
            }
        }


    }

    public static int reverse(int number) {
       int reversedNumber = 0;
       while (number != 0) {
           int digit = number % 10;
           reversedNumber = reversedNumber * 10 + digit;
           number = number / 10;
       }
       return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int digitCount = 1;
        while (number > 9) {
            number = number / 10;
            digitCount++;
        }
        return digitCount;
    }

}
