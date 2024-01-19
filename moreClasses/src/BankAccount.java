public class BankAccount {
    // final == const <- CONSTANTE nao pode ser mudada
    public static final String BANK_NAME = "Arthur's Bank";
    private String accountHolder;
    private double balance = 0.0;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance){
        this.balance = balance;
    }

    public void addBalance(double value){
        setBalance(getBalance() + value);
    }

    public void rmvBalance(double value){
        setBalance(getBalance() - value);
    }




    BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


}
