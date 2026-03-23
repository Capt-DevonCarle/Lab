/*3. Vehicle Registration System 
Create class Vehicle with vehicleNo and ownerName. 
Create subclass Car with model and fuelType. 
     Use constructor chaining to initialize all details. */

public class s3p3 {
    public class Vehicle {
        private String vehicleNo;
        private String ownerName;

        public Vehicle(String vehicleNo, String ownerName) {
            this.vehicleNo = vehicleNo;
            this.ownerName = ownerName;
        }

        public void display() {
            System.out.println("Vehicle No: " + vehicleNo);
            System.out.println("Owner Name: " + ownerName);
        }
    }

    public class Car extends Vehicle {
        private String model;
        private String fuelType;

        public Car(String vehicleNo, String ownerName, String model, String fuelType) {
            super(vehicleNo, ownerName);
            this.model = model;
            this.fuelType = fuelType;
        }

        public void display() {
            super.display();
            System.out.println("Model: " + model);
            System.out.println("Fuel Type: " + fuelType);
        }
    }

    public static void main(String[] args) {
        Car car = new s3p3().new Car("ABC123", "John Doe", "Toyota Camry", "Petrol");
        car.display();
    }
    
}
