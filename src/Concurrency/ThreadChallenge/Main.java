package Concurrency.ThreadChallenge;

public class Main {
    public static void main(String[] args) {
        Thread evenThread = new EvenThread();

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("OddThread interrupted!");
                    break;
                }
            }
        });

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        oddThread.start();
        evenThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        evenThread.interrupt();
    }
}
