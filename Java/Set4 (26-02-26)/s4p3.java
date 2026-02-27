/*3. Check if a List Contains a Specific Element 
Problem: 
• Given a List<String>, check if a specific string is present. 
Hint: Use the contains() method of List.*/
import java.util.*;

public class s4p3 {
    public static void main(String[] args) {
        //Creating a list
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        //Search for elements
        String searchElement = "Banana";
        String nonExistentElement = "Grape";

        boolean hasBanana = fruits.contains(searchElement);
        boolean hasGrape = fruits.contains(nonExistentElement);

        System.out.println("Does the list contain \"" + searchElement + "\"? " + hasBanana); // true
        System.out.println("Does the list contain \"" + nonExistentElement + "\"? " + hasGrape); // false
    }
}
