/*2. Employee Salary System 
Create a class Employee with name and baseSalary. 
Create subclass Manager with bonus. 
     Calculate total salary using inherited data. */
public class s3p2 {
    public class Employee {
        private String name;
        private double basesalary;

    }

    public class Manager extends Employee {
        private double bonus;

        public Manager(String name, double basesalary, double bonus) {
            super.name = name;
            super.basesalary = basesalary;
            this.bonus = bonus;
        }

        public void calculateTotalSalary() {
            double totalSalary = super.basesalary + bonus;
            System.out.println("Total Salary of " + super.name + ": " + totalSalary);
        }
    }
    public static void main(String[] args) {
        Manager manager = new s3p2().new Manager("Bob", 50000.0, 10000.0);
        manager.calculateTotalSalary();
    }
}
