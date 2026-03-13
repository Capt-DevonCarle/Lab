public class s7p10 {
        /*Create a class Sentence that stores a sentence (String). Write a method that splits 
the sentence into words and counts the total number of words. */
    public static void main(String[] args) {
        class Sentence {
            String text;

            public Sentence(String text) {
                this.text = text;
            }

            void countWords() {
                String[] words = text.split("\\s+");
                System.out.println("Total number of words: " + words.length);
            }
        }

        Sentence sentence = new Sentence("Hello, I am tired as _____. I wonder will the characters count as a word?");
        sentence.countWords();
    }
}
