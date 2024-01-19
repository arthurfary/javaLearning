public class CreditBankAccount extends BankAccount {
    private double creditCardLimit;

    // Constructors
    CreditBankAccount(String accountHolder, double creditCardLimit) {
        super(accountHolder);
        this.creditCardLimit = creditCardLimit;
    }

    CreditBankAccount(String accountHolder, double balance, double creditCardLimit) {
        super(accountHolder, balance);
        this.creditCardLimit = creditCardLimit;
    }

    // Getters and Setters
    public double getCreditCardLimit() {
        return creditCardLimit;
    }

    public void setCreditCardLimit(double creditCardLimit) {
        if (creditCardLimit >= 0) {
            this.creditCardLimit = creditCardLimit;
        } else {
            throw new RuntimeException("Credit card limit cannot be lower than 0");
        }
    }

    // Other methods
    @Override
    public double getBalance() {
        return (getCreditCardLimit() + super.getBalance());
    }
}
