import java.util.ArrayList;
import java.util.Vector;

public class Day16_9 {
	public static void main(String[] args)
	{
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		//Vector(Collection<? extends E> c)
		Vector<Integer>v=new Vector<Integer>(a1); 
		
		System.out.println("Array List = "+a1);
		System.out.println("Vector = "+v+ " Size = "+v.size()+ " Capacity = "+v.capacity() );
	
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("Akshita");
		a2.add(34);
		a2.add(60000.56f);
		//o="Akshita" ==> String ==> Object = String ===> Upcasting 
		//o = 34  ===> Integer ==> Object = Integer ==> Upcasting
		//o = 60000.56f ==> Float ==> Object = Float ==> Upcasting 
		System.out.println(a2);
		for(Object o:a2) 
			System.out.println(o);
			
		///for(ArrayList a:a2) //javac error
			//System.out.println(a); 
	}

}
