/*4. Convert an Array to a List and Vice Versa 
Problem: 
• Convert an Integer[] array into a List<Integer> and back to an array. 
Hint: Use Arrays.asList() and toArray().*/
import java.util.Arrays;
import java.util.List;
public class s4p4 {
    public static void main(String[] args) {
        // Original Integer array
        Integer[] array = {1, 2, 3, 4, 5};

        // Convert array to a List
        List<Integer> list = Arrays.asList(array);

        // Print the List
        System.out.println("List: " + list);

        // Convert List back to an array
        Integer[] newArray = list.toArray(new Integer[0]);

        // Print the new array
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}