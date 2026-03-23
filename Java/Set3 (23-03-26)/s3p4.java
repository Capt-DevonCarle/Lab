/*4. Online Shopping – Product System 
Create class Product with name and price. 
Create subclass Electronics with warrantyPeriod. 
     Display product details and final price.  */

public class s3p4 {
    public class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public void displayDetails() {
            System.out.println("Product Name: " + name);
            System.out.println("Price: " + price);
        }
    }

    public class Electronics extends Product {
        private int warrantyPeriod;

        public Electronics(String name, double price, int warrantyPeriod) {
            super(name, price);
            this.warrantyPeriod = warrantyPeriod;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Warranty Period: " + warrantyPeriod + " years");
        }
    }

    public static void main(String[] args) {
        Electronics electronicItem = new s3p4().new Electronics("Smartphone", 699.99, 2);
        electronicItem.displayDetails();
    }
    
}
