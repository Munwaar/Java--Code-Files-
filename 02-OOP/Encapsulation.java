class BankAccount {

    // Private data members
    private String accountHolder;
    private double balance;

    // Setter method
    public void setAccountHolder(String name) {
        accountHolder = name;
    }

    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid balance!");
        }
    }

    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolder("Munwaar");
        account.setBalance(25000);

        System.out.println("Bank Account Details:");
        account.displayDetails();
    }
}
