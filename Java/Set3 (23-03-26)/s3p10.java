/*0. Mobile Recharge System 
Create class Recharge with mobileNumber and planAmount. 
Create subclass DataRecharge with dataLimit. 
Show recharge details and benefits.  */

public class s3p10 {
    public class Recharge {
        protected String mobileNumber;
        protected double planAmount;

        public Recharge(String mobileNumber, double planAmount) {
            this.mobileNumber = mobileNumber;
            this.planAmount = planAmount;
        }

        public void display() {
            System.out.println("Mobile Number: " + mobileNumber);
            System.out.println("Plan Amount: " + planAmount);
        }
    }

    public class DataRecharge extends Recharge {
        private double dataLimit;

        public DataRecharge(String mobileNumber, double planAmount, double dataLimit) {
            super(mobileNumber, planAmount);
            this.dataLimit = dataLimit;
        }

        public void displayBenefits() {
            System.out.println("Data Limit: " + dataLimit + " GB");
            System.out.println("Enjoy your recharge with " + dataLimit + " GB of data!");
        }
    }

    public static void main(String[] args) {
        DataRecharge dataRecharge = new s3p10().new DataRecharge("9876543210", 199.0, 1.5);
        dataRecharge.display();
        dataRecharge.displayBenefits();
    }
    
}
