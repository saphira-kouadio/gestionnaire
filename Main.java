public class Main {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount("CHK001", 1500.0, 500.0);
        SavingsAccount savings = new SavingsAccount("SAV001", 3000.0, 2.5);
        COD cod = new COD("COD001", 5000.0, 12);

        System.out.println("Compte courant : " + checking.account + ", Solde : " + checking.balance + ", Limite : " + checking.limit);
        System.out.println("Compte épargne : " + savings.account + ", Solde : " + savings.balance + ", Taux : " + savings.interestRate + " %");
        System.out.println("Certificat de dépôt : " + cod.account + ", Solde : " + cod.balance + ", Durée : " + cod.durationMonths + " mois");
    }
}