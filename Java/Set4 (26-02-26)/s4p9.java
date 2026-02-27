/*9. Find Common Elements Between Two Lists 
Problem: 
• Given two List<Integer>, find the common elements. 
List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5); 
List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7); 
System.out.println(findCommonElements(list1, list2));   
// Output: [3, 4, 5] 
Hint: Use retainAll() method. */
import java.util.*;



public class s4p9 {
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) 
    {   List<Integer> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;
    }
    public static void main(String[] args)
    {
        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        List<Integer> list2= Arrays.asList(3,4,5,6,7);
        List<Integer> commonElements = findCommonElements(list1, list2);
        System.out.println(commonElements);
    }
}
