/*2. Remove an Element from a List 
Problem: 
• Given a List<Integer>, remove all occurrences of a specific number. 
List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 2, 5); 
int target = 2; 
System.out.println(removeElement(numbers, target));   
// Output: [1, 3, 4, 5] 
Hint: Use removeIf() method.*/
import java.util.*;

public class s4p2{
    public static ArrayList<Integer> removeElement(ArrayList<Integer> list, int target)
    {
        list.removeIf(n -> n==target);  //predicate= target (taken before)
        return list;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 4, 2, 5));
        int target = 2; 
        ArrayList<Integer> result = removeElement(numbers, target);
        System.out.println(result);         
//////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        num.removeIf(n -> n==2);
        for(int i=0; i<num.size(); i++)
        { 
            System.out.println(num .get(i));
        }

    }
}
