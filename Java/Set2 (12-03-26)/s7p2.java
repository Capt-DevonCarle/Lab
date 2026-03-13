public class s7p2 {
    static class Rectangle {
        double length;
        double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        
        public Rectangle() {
            this.length = 0.0;
            this.width = 0.0;
        }

        void calculateArea() {
            double area = length * width;
            System.out.println("Area of the rectangle: " + area);
        }
    }

    public static void main(String[] args){
        /*Create a class Rectangle with length and width. 
        Use a parameterized constructor to initialize the values and 
        write a method to calculate and display the area.*/

        Rectangle rect = new Rectangle(5.0, 3.0);
        rect.calculateArea();
    }
}

