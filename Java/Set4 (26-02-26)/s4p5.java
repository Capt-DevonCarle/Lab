/*5. Find the Maximum and Minimum Elements in a List 
Problem: 
• Given a List<Integer>, find and print the maximum and minimum values. 
Hint: Use Collections.max() and Collections.min().*/
import java.util.*;

public class s4p5 {
    public static void main(String[] args) {
        // Create a List of Integers
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

        // Find the maximum value
        Integer maxValue = Collections.max(numbers);

        // Find the minimum value
        Integer minValue = Collections.min(numbers);

        // Print the results
        System.out.println("The list of numbers: " + numbers);
        System.out.println("Maximum element: " + maxValue);
        System.out.println("Minimum element: " + minValue);
    }
}