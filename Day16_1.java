import java.util.Iterator;
import java.util.Stack;

public class Day16_1 {

	public static void main(String[] args)
	{
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(10); 
		stk.push(25); 
		stk.push(20); 
		stk.push(5); 
		
		System.out.println(stk.search(25));
		System.out.println(stk.search(20));
		System.out.println(stk.search(15));
		System.out.println(stk.search(10));
		
		stk.pop();
		stk.pop();
		stk.pop();
		stk.pop();
		System.out.println("all elements are popped"+stk);
		stk.pop(); //Exception 
		
		
		
		/*System.out.println(stk);
		stk.sort(null);
		System.out.println(stk);
		Integer element = null;
		element = stk.peek();
		System.out.println("Element = "+element);
		
		/*while(!stk.empty()) //if stack is not empty 
		{
			element = stk.peek(); //peek() will take the element pointed by top
			System.out.println("Element = "+element); //print the element 
			stk.pop(); // remove the element 
		}*/
		System.out.println("stack : "+stk);
		
		
	}
}