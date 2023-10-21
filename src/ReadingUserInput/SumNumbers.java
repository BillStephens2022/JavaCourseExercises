package ReadingUserInput;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {
        // sumIntegers();
        sumFloatingNumbers();
    }

    public static void sumIntegers() {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ": ");
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        }
        System.out.println("The sum is: " + sum);
    }

    public static void sumFloatingNumbers() {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double sum = 0;

        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ": ");
            String nextNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        }
        System.out.println("The sum is: " + sum);
    }


}
