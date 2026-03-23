/* 9. Library Management 
Create class Book with title and author. 
Create subclass IssuedBook with issueDate and returnDate. 
     Display issued book details. */

public class s3p9 {
    public class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public class IssuedBook extends Book {
        private String issueDate;
        private String returnDate;

        public IssuedBook(String title, String author, String issueDate, String returnDate) {
            super(title, author);
            this.issueDate = issueDate;
            this.returnDate = returnDate;
        }

        public void display() {
            super.display();
            System.out.println("Issue Date: " + issueDate);
            System.out.println("Return Date: " + returnDate);
        }
    }

    public static void main(String[] args) {
        IssuedBook issuedBook = new s3p9().new IssuedBook("The Great Gatsby", "F. Scott Fitzgerald", "2023-03-01", "2023-03-15");
        issuedBook.display();
    }
    
}
