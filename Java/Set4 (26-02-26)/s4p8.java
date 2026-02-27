/*8. Count the Frequency of Elements in a List 
Problem: 
• Given a List<String>, count how many times each string appears. 
List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"); 
System.out.println(countFrequencies(words));   
// Output: {apple=3, banana=2, orange=1} 
Hint: Use a HashMap<String, Integer>.*/
import java.util.*;
public class s4p8 {
    public static Map<String, Integer> countFrequencies(List<String> list)
    {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for(String word: list)
        {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0)+1);
        }

        return frequencyMap;
    }
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"); //input
        Map<String, Integer> frequencies = countFrequencies(words);
        System.out.println(frequencies);
    }
}



