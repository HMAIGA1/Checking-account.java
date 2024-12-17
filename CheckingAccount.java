public class CheckingAccount { // Main Checking Account Class 
    // Variables and Field Instances 
    double initialBalance; 
    double deposit;
    double withdrawal;
    double balance; 

    // Checking Account Method
    public CheckingAccount () {
        
    };

    public double initialBalance (double accountInitialBalance) {
        initialBalance = accountInitialBalance; 
        return initialBalance;
    }

    public double deposit (double accountDeposit) {
        deposit = accountDeposit;
        return deposit;
    }

    public double withdrawal (double accountWithdrawal) {
        withdrawal = accountWithdrawal;
        return withdrawal;
    }

    public double balance ( ) {
        return balance;
    }



}
