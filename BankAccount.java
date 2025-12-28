package newprojectbaankaccount;


class BankAccount {
    private String accountNumber;
    private double balance;
    protected  double interestRate;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Account created with account number: " + accountNumber + " and balance: " + balance);
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {

        return balance;
    }

    protected void setBalance(double balance) {

        this.balance = balance;
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if(amount<=0){
            System.out.println("withdral amount must be positived: ");
            return;


        }
        if(amount>balance){
            System.out.println(" Insufficient balance ");
            return;

        }
        balance -= amount;
        System.out.println(amount + " withdrawn. New balance: " + balance);
    }

    public double calculateInterest(){
        return balance * interestRate/100;
    }
}
