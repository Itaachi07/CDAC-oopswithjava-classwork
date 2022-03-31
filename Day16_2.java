import java.util.Stack;

public class Day16_2 {

	public static void main(String[] args) {
			Stack<Integer> stk=new Stack<Integer>();
			stk.push(10); 
			stk.push(15); 
			stk.push(20); 
			stk.push(25); 
			
			System.out.println(stk+" Size "+stk.size());
			System.out.println("Class "+stk.getClass());
			Object[] strArray=stk.toArray();
			
			System.out.println("Array Contents ");
			
			for(int i=0;i<strArray.length;i++)
				System.out.print(" "+strArray[i]);
			
			System.out.println("\n Class "+strArray.getClass());

	}

}
