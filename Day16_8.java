import java.util.Enumeration;
import java.util.Vector;

public class Day16_8 {
	public static void main(String[] args)
	{
		//Vector(int initialCapacity, int capacityIncrement)
		Vector<Integer> v=new Vector<Integer>(3,5);
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		System.out.println(v+" "+"size = "+v.size()+ " Capacity = "+v.capacity());
		v.addElement(40);
		System.out.println(v+" "+"size = "+v.size()+ " Capacity = "+v.capacity());
		
		//applying enumeration to vector elements 
		//internally iteration is applied 
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements())
			{
			System.out.print(" "+e.nextElement());
			
			}
		//if after completer iteration we try to access the element
		// It will throw exception 
		//System.out.println(e.nextElement()); //NoSuchElementException
		
	}

}
