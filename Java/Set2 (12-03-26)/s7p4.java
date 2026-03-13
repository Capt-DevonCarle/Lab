public class s7p4 {
    public static void main(String[] args) {
        /*Create a class Book with attributes title and price. Implement two constructors: 
one default constructor and one parameterized constructor. Display the book 
details. */
        class Book {
            String title;
            double price;

            //Default constructor
            public Book() {
                this.title = " ";
                this.price = 0.0;
            }

            //parameterized constructor
            public Book(String title, double price) {
                this.title = title;
                this.price = price;
            }

            void displayDetails() {
                System.out.println("Title: " + title);
                System.out.println("Price: " + price);
            }
        }

        Book book1 = new Book();
        Book book2 = new Book("Java Programming", 29.99);

        book1.displayDetails();
        book2.displayDetails();
    }
}
