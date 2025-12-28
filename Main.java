package newprojectbaankaccount;

public class Main {
    public static void main(String[] args) {
        SavingAccount sa = new
                SavingAccount("SA001", 5000);
        DpsAccount dps = new DpsAccount("DPS2001", 10000);
        FixedDepositAccount fd = new
                FixedDepositAccount("FD501", 200000, 24);
        sa.deposit(1000);
        sa.withdraw(500);
        System.out.println("Saving Interest :"+ sa.calculateInterest());
        System.out.println("DPS Interest: " + dps.calculateInterest());
        System.out.println("Fixed Deposit Interest: " + fd.calculateInterest());
    }
}


