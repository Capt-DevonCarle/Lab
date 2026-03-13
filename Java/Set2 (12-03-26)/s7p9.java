public class s7p9 {
    /*Create a class BankAccount with attributes accountHolderName and balance. Use a 
constructor to initialize them and implement a method to deposit money and 
display the updated balance.  */
    public static void main(String[] args) {
        class BankAccount {
            String accountHolderName;  
            double balance;

            public BankAccount(String accountHolderName, double balance) {
                this.accountHolderName = accountHolderName;
                this.balance = balance;
            }

            void deposit(double amount) {
                balance += amount;
                System.out.println("Deposited: " + amount);
                System.out.println("Account Holder: " + accountHolderName);
                System.out.println("Updated balance: " + balance);
            }
        }

        BankAccount account = new BankAccount("John Doe", 1000.0);
        account.deposit(500.0);
    }
}
