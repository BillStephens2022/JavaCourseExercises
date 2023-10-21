package ReadingUserInput;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
      inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int avg = 0;
        int loopCount = 0;

        while(true) {
//            System.out.println("Enter a number, or any character to exit: ");
            String nextEntry = scanner.nextLine();
            try {
                int validNum = Integer.parseInt(nextEntry);

                loopCount++;
                sum += validNum;
                avg = (int) Math.round((double) sum / loopCount);

            } catch (NumberFormatException nfe) {
                break;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);

    }
}
