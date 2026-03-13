public class s7p7 {
    public static void main(String[] args) {
        /*Create a class Message that stores a string. Write methods to display the length of 
the string and its uppercase form.*/
        class Message {
            String text;

            public Message(String text) {
                this.text = text;
            }

            void displayLength() {
                System.out.println("Length of the message: " + text.length());
            }

            void displayUpperCase() {
                System.out.println("Message in uppercase: " + text.toUpperCase());
            }
        }

        Message message = new Message("Hello, World!");
        message.displayLength();
        message.displayUpperCase();
    }
}
