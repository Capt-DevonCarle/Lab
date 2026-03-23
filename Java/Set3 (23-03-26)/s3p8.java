/*8. Food Delivery System 
Create class Order with orderId and amount. 
Create subclass OnlineOrder with deliveryCharge. 
     Calculate final bill using super.  */

public class s3p8 {
    public class Order {
        private String orderId;
        private double amount;

        public Order(String orderId, double amount) {
            this.orderId = orderId;
            this.amount = amount;
        }
    }

    public class OnlineOrder extends Order {
        private double deliveryCharge;

        public OnlineOrder(String orderId, double amount, double deliveryCharge) {
            super(orderId, amount);
            this.deliveryCharge = deliveryCharge;
        }

        public void calculateFinalBill() {
            double finalBill = super.amount + deliveryCharge;
            System.out.println("Final Bill for Order ID " + super.orderId + ": " + finalBill);
        }
    }

    public static void main(String[] args) {
        OnlineOrder onlineOrder = new s3p8().new OnlineOrder("ORD123", 50.0, 5.0);
        onlineOrder.calculateFinalBill();
    }
    
}
