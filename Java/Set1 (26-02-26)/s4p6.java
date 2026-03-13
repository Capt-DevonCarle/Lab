/*6. Reverse a List 
Problem: 
• Given a List<String>, reverse its elements. 
Hint: Use Collections.reverse().*/
import java.util.*;

public class s4p6 {
    public static void main(String[] args) {
        // Create an example list
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("Original list: " + fruits);

        // Reverse the list in place
        Collections.reverse(fruits);

        System.out.println("Reversed list: " + fruits);
    }
}