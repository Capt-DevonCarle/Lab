/*1. Add and Retrieve Elements from an ArrayList 
Problem: 
• Create an ArrayList<String>, add five names to it, and print each name using a 
loop. 
Hint: Use add() and get() methods of ArrayList.*/
import java.util.ArrayList;
import java.util.Scanner;

public class s4p1{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++)
        {   System.out.println("Enter name " + (i+1) + ": ");   //Will print as is
            String name = sc.nextLine();    /// Will read the inputs
            names.add(name);

        }

        System.out.println("Names in the ArrayList:");
        for(int i=0; i<names.size(); i++)
        {  System.out.print("Entered names are: ");
            System.out.println(names.get(i));       //Will print the names one by one
        }
        
        sc.close();
    }
}