/*7. School Result System 
Create class Student with name and marks. 
Create subclass Result with grade. 
     Compute grade and display result using inherited data.(Usage of super();)) */
public class s3p7 {
   
        public class Student {
            private String name;
            private int marks;
    
            public Student(String name, int marks) {
                this.name = name;
                this.marks = marks;
            }
    
            public void display() {
                System.out.println("Name: " + name);
                System.out.println("Marks: " + marks);
            }
        }
    
        public class Result extends Student {
            private String grade;

             private void calculateGrade() {
                if (super.marks >= 90) {
                    grade = "A";
                } else if (super.marks >= 80) {
                    grade = "B";
                } else if (super.marks >= 70) {
                    grade = "C";
                } else if (super.marks >= 60) {
                    grade = "D";
                } else {
                    grade = "F";
                }
            }
    
            public Result(String name, int marks) {
                super(name, marks);
                calculateGrade();
            }
    
            public void display() {
                super.display();
                System.out.println("Grade: " + grade);
            }
    
        }
    
        public static void main(String[] args) {
            Result result = new s3p7().new Result("Alice", 85);
            result.display();
        }
    
}
