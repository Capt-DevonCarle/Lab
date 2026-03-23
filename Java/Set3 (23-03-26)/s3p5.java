/*5. Bank Account System 
Create class Account with accNo and balance. 
Create subclass SavingsAccount with interestRate. 
     Use super() and calculate interest.  */

public class s3p5 {
    public class Account {
        protected String accNo;
        protected double balance;

        public Account(String accNo, double balance) {
            this.accNo = accNo;
            this.balance = balance;
        }

        public void display() {
            System.out.println("Account No: " + accNo);
            System.out.println("Balance: " + balance);
        }
    }

    public class SavingsAccount extends Account {
        private double interestRate;

        public SavingsAccount(String accNo, double balance, double interestRate) {
            super(accNo, balance);
            this.interestRate = interestRate;
        }

        public void calculateInterest() {
            double interest = (balance * interestRate) / 100;
            System.out.println("Interest: " + interest);
            System.out.println("Final Balance: " + (balance + interest));
        }
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new s3p5().new SavingsAccount("123456", 1000.0, 5.0);
        savingsAccount.display();
        savingsAccount.calculateInterest();
    }
    
}
