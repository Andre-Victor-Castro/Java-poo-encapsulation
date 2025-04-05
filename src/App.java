public class App {
    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount();
        // account.balance = 9999; Immutability and best practices.

        // Tell, Don’t Ask principle
        System.out.println(account.deposit(100));
        System.out.println(account.deposit(100));
        System.out.println(account.withdraw(200));

        // Getters and Setters
        System.out.println(account.getAccountHolderName());
        System.out.println(account.setAccountHolderName("NewName"));
    }
}
