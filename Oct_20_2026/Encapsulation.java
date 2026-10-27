
class BankAccount {

    private double balance;

    public void deposite(double amount) {
        if (amount > 0) {
            balance = balance + amount;

        }
    }

    public double getBalance() {
        return balance;
    }

}

public class Encapsulation {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposite(1000);
        System.out.println("Balance: " + account.getBalance());
    }
}
