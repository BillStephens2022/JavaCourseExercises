package while_loop;

public class Main {
    public static void main(String[] args) {

        // for loop example
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // while loop example (this does the same thing as above)
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // do-while loop example (this does the same thing as above)
        // note: ignore code editor warnings, the code will still work
        int k = 1;
        boolean isReady = false;
        do {
            if (k > 5) {
                break;
            }
            System.out.println(k);
            k++;
            isReady = (k > 0);
        } while (isReady);

        // continue statement
        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;  // will skip #'s divisible by 25
            }
            System.out.print(number + "_");
        }

    }


}




