package newprojectbaankaccount;

class FixedDepositAccount extends BankAccount {
    private int termInMonths;

    public FixedDepositAccount(String accountNumber, double balance, int termInMonths) {
        super(accountNumber, balance);
        this.termInMonths = termInMonths;
    }

    public int getTermInMonths() {
        return termInMonths;
    }
    public double calculatInterestRate(){
        return getBalance()*interestRate / 100;
    }
}
