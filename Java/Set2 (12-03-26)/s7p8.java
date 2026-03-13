public class s7p8 {
    /*Create a class Student with attributes name and marks. Create an array of Student 
objects and display the details of all students.  */
    public static void main(String[] args) {
        class Student {
            String name;
            int marks;

            public Student(String name, int marks) {
                this.name = name;
                this.marks = marks;
            }
        }

        Student[] students = new Student[3];
        students[0] = new Student("Alice", 85);
        students[1] = new Student("Bob", 92);
        students[2] = new Student("Charlie", 78);

        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Marks: " + student.marks);
        }
    }
}
