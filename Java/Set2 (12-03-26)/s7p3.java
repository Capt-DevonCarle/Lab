public class s7p3 {
    /*Create a class Employee with attributes name, designation, and salary. Initialize 
them using a constructor and display the employee information.*/
    static class Employee {
        String name;
        String designation;
        double salary;

        public Employee(String name, String designation, double salary) {
            this.name = name;
            this.designation = designation;
            this.salary = salary;
        }

        public Employee() {
            this.name = " ";
            this.designation = " ";
            this.salary = 0.0;
        }

        void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Software Engineer", 50000.0);
        emp.displayInfo();
    }
}
