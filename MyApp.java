public class MyApp { // Main System Class
    public static void main (String [] args) { // Main System - Main Method
        System.out.println("Main System Initialized..."); // Main System Output

        // Checking Account Object Creation
        CheckingAccount Acc1 = new CheckingAccount();

        Acc1.deposit(1000);
        System.out.println(Acc1.deposit);

    }

}
