/*7. Sort a List in Ascending and Descending Order 
Problem: 
• Given a List<Integer>, sort it in both ascending and descending order. 
Hint: Use Collections.sort() and Collections.reverseOrder().*/
import java.util.*;

public class s4p7 {

    public static void main(String[] args) {
        // Initialize an example List<Integer>
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);

        System.out.println("Original list: " + numbers);

        // --- ASCENDING ORDER ---
        // Create a copy to preserve the original state for the next sort
        List<Integer> ascendingList = new ArrayList<>(numbers);
        
        // Use Collections.sort() for natural order (ascending)
        Collections.sort(ascendingList); 
        System.out.println("List in ascending order: " + ascendingList);

        // --- DESCENDING ORDER ---
        List<Integer> descendingList = new ArrayList<>(numbers);
        
        // Use Collections.sort() with a reverse comparator (descending)
        // You can use Collections.reverseOrder() or Comparator.reverseOrder()
        Collections.sort(descendingList, Collections.reverseOrder());
        System.out.println("List in descending order: " + descendingList);
    }
}