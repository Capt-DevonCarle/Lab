public class s7p5 {
    public static void main(String[] args) {
        /*Create a class Student that stores marks of 5 subjects in an array. Use a 
constructor to initialize the array and write a method to calculate the average 
marks. */
        class Student {
            int marks[];

            public Student(int marks[]) {
                this.marks = marks;
            }

            double calculateAverage() {
                int sum = 0;
                for (int mark : marks) {
                    sum += mark;
                }
                return (double) sum / marks.length;
            }
        }
        int[] marks = {85, 90, 78, 92, 88};
        Student student = new Student(marks);
        double average = student.calculateAverage();
        System.out.println("Average Marks: " + average);
    }
}
