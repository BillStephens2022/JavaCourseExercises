package while_loop;

public class isEvenNumber {
    public static void main(String[] args) {

        int number = 5;
        int endingNumber = 20;

        // Method 1
//        while (number <= endingNumber) {
//            if (isEvenNumber(number)) {
//                System.out.println("Even number " + number);
//            }
//            number++;
//        }

        // Method 2 - same as above but added additional condition to only find 5 numbers

        int evenCount = 0;
        int oddCount = 0;

        while (number <= endingNumber) {
            if (!isEvenNumber(number)) {
                oddCount++;
                number++;
                continue;
            }
            if (evenCount >= 5) {
                break;
            }
            System.out.println("Even number " + number);
            evenCount++;
            number++;

        }
        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
