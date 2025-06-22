public class COD extends BankAccount {
    public int durationMonths;

    public COD(String account, double balance, int durationMonths) {
        this.account = account;
        this.balance = balance;
        this.durationMonths = durationMonths;
    }
}