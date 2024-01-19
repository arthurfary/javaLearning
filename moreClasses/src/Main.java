public class Main {
    public static void main(String[] args) {


        BankAccount account = new BankAccount("Arthur");

        account.addBalance(100.00);

        System.out.println(account.getBalance());

        account.rmvBalance(10.00);

        System.out.println(account.getBalance());

        // usando static pode ser acessado sem instancia de objeto
        // account <- instancia
        // BankAccount <- Objeto
        System.out.println(BankAccount.BANK_NAME);

        //--------------

        CreditBankAccount creditAccount = new CreditBankAccount("Mixirica", 150.00, 100.00);

        // sobrescreve o getBalance do BankAccount
        System.out.println(creditAccount.getBalance());

    }
}