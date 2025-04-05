public class BankAccount {

    // Immutability and best practices.
    private float balance = 0;
    private String accountHolderName = "AndreVsc";
    
    // Tell, Don’t Ask principle
    public String deposit(float amount) {
        if (amount > 0) {
            this.balance += amount;
            return "\n Amount deposited: " + amount + " \n Current balance: " + this.balance;
        }
        return "\n Invalid deposit amount.";
    }

    public String withdraw(float amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return "\n Amount withdrawn: " + amount + " \n Current balance: " + this.balance;
        }
        return "\n Insufficient balance or invalid amount.";
    }
    
    // Getters and Setters
    public String getAccountHolderName() {
        return "\n Name: " + accountHolderName;
    }

    public String setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        return "\n New name: " + accountHolderName;
    }
}