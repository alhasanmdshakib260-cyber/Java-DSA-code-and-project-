package newprojectbaankaccount;
 class SavingAccount extends BankAccount{

         public SavingAccount(String accountNumber, double balance){

             super(accountNumber,balance);
         }
         public double calculateInterest(){
             return getBalance()*interestRate / 100;
         }

 }

