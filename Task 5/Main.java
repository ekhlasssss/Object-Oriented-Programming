public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("001", "Alice");
        BankAccount account2 = new BankAccount("002", "Bob");

        account1.deposit(1000);
        account1.getAccountDetails();

        account1.withdraw(400);
        account1.getAccountDetails();

        account1.withdraw(700);
        account1.getAccountDetails();

        account2.deposit(500);
        account2.getAccountDetails();

        account2.withdraw(200);
        account2.getAccountDetails();
    }
}
