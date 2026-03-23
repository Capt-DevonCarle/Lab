/*6. Hospital Management 
Create class Person with name and age. 
Create subclass Patient with disease and doctorAssigned. 
     Display complete patient information. */

public class s3p6 {
    public class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public class Patient extends Person {
        private String disease;
        private String doctorAssigned;

        public Patient(String name, int age, String disease, String doctorAssigned) {
            super(name, age);
            this.disease = disease;
            this.doctorAssigned = doctorAssigned;
        }

        @Override
        public void display() {
            super.display();
            System.out.println("Disease: " + disease);
            System.out.println("Doctor Assigned: " + doctorAssigned);
        }
    }

    public static void main(String[] args) {
        Patient patient = new s3p6().new Patient("John Doe", 45, "Flu", "Dr. Smith");
        patient.display();
    }
    
}
