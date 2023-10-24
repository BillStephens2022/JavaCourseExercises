package Classes;

public class BankAccount {
    private String accountNumber = "";
    private double accountBalance = 0.00;
    private String customerName = "";
    private String email = "";
    private String phoneNumber = "";

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds(double depositAmount) {
        this.accountBalance += depositAmount;
        return this.accountBalance;
    }

    public double withdrawFunds(double withdrawalAmount) {
        if (this.accountBalance < withdrawalAmount) {
            System.out.println("Not Permitted, withdrawal amount requested is greater than Account Balance!");
            return this.accountBalance;
        } else {
            this.accountBalance -= withdrawalAmount;
        }
        return this.accountBalance;
    }
}
