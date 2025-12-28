package newprojectbaankaccount;

class DpsAccount extends BankAccount{
    public DpsAccount(String accountNumber, double balance){
        super(accountNumber,balance);

    }
    public double calculateInterest(){

        return getBalance()*interestRate / 100;
    }
}