/*1. College Student Record 
Create a class Person with name and age. 
Create Student with rollNo and course. 
     Use super() to initialize common details and display full student record.  */

public class s3p1 {
    public class Person{
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

    public class Student extends Person{
        private int rollNo;
        private String course;

        public Student(String name, int age, int rollNo, String course) {
            super(name, age);
            this.rollNo = rollNo;
            this.course = course;
        }

        public void display() {
            super.display();
            System.out.println("Roll No: " + rollNo);
            System.out.println("Course: " + course);
        }
    }
    public static void main(String[] args) {
        Student student = new s3p1().new Student("Alice", 20, 101, "Computer Science");
        student.display();
    }   
}
