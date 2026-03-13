public class s7p1 {
    static class Student {
        String name;
        int rollNo;
        public Student(String name, int rollNo) {
            this.name = " ";
            this.rollNo = 0;
        }

        public Student() {
            this.name = "Alice";
            this.rollNo = 101;
        }

        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
        }
    }
    public static void main(String[] args) {
       /*Create a class Student with data members name and rollNo. 
       Use a constructor to initialize them and display the student details.*/
        Student student1 = new Student();
        Student student2 = new Student("Bob", 102);
        student1.displayDetails();
        student2.displayDetails();
    }   
    
}
