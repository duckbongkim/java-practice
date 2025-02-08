package calss1.access;

public class BanckMain {
    public static void main(String[] args) {
        BankAccount amount = new BankAccount();

        amount.withdraw(200000);

        amount.deposit(5000);
        amount.withdraw(3000);

        amount.getBalance();
    }
}
