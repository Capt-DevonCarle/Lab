public class s7p6 {
    public static void main(String[] args) {
        /*Create a class Car with attributes brand and price. Use the this keyword inside the 
constructor to initialize the variables and display the details.*/
        class Car {
            String brand;
            double price;

            public Car(String brand, double price) {
                this.brand = brand;
                this.price = price;
            }

            void displayDetails() {
                System.out.println("Brand: " + brand);
                System.out.println("Price: " + price);
            }
        }

        Car car1 = new Car("Honda", 25000.0);
        car1.displayDetails();
    }
}
