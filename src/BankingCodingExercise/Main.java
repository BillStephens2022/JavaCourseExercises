package BankingCodingExercise;

public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000.0);
        bob.addTransaction(-200.0);
        bob.addTransaction(50.0);
        System.out.println(bob);
    }
}
