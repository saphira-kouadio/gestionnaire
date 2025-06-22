public class SavingsAccount extends BankAccount {
    public double interestRate;

    public SavingsAccount(String account, double balance, double interestRate) {
        this.account = account;
        this.balance = balance;
        this.interestRate = interestRate;
    }
}