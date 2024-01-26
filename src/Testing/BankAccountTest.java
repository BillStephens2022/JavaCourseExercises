package Testing;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() throws Exception {
        BankAccount account = new BankAccount("Bill", "Stephens", 1000, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200, balance, 0);
    }

    @org.junit.Test
    public void withdraw() throws Exception {
        BankAccount account = new BankAccount("Bill", "Stephens", 1000, BankAccount.CHECKING);
        double balance = account.withdraw(200.00, true);
        assertEquals(800, balance, 0);
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        BankAccount account = new BankAccount("Bill", "Stephens", 1000, BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1200, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_widthdraw() throws Exception {
        BankAccount account = new BankAccount("Bill", "Stephens", 1000, BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Bill", "Stephens", 1000, BankAccount.CHECKING);
        assertTrue(account.isChecking());
    }

}