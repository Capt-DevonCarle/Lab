/*10. Implement a Stack Using Deque 
Problem: 
• Use Deque<Integer> to implement a stack with: 
o push(int x)
o pop() 
o peek() 
o isEmpty() 
Hint: Use ArrayDeque<Integer> with addFirst() and removeFirst().  */
import java.util.*;

public class s4p10 {
    private Deque<Integer> stack;
    public s4p10(){
        stack = new ArrayDeque<>();
    }

    // Push element to stack
    public void push(int x) {
        stack.addFirst(x);
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.removeFirst();
    }

    // Get top element
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty"); 
        }
        return stack.peekFirst();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        s4p10 stack = new s4p10(); //creating an object of program's class
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop()); // ouput: 3
        System.out.println(stack.peek()); // output: 2
        System.out.println(stack.isEmpty()); // output: false
    }
}
//Message instead of print to avoid confusion with the output of the program.
//throwing the exception 