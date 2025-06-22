public class CheckingAccount extends BankAccount {
    public double limit;

    public CheckingAccount(String account, double balance, double limit) {
        this.account = account;
        this.balance = balance;
        this.limit = limit;
    }
}