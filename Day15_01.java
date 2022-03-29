import java.util.ArrayList;
import java.util.Collections;

/*
public class Day15_01 {

	public static void main(String[] args) 
	{
		ArrayList<String>a1=new ArrayList<String>();
		ArrayList<String>a2=new ArrayList<String>();
		ArrayList<String>a3=new ArrayList<String>();
		a1.add("Akshita");
		a1.add("Sunbeam");
		a1.add("Pune");
		a1.add("HeadTechnical");
		a1.add("Trainer");
		a2=(ArrayList<String>) a1.clone();
		a3=a1; //reference copy //shallow copy
		System.out.println(a1+" "+a1.hashCode());
		System.out.println(a2+" "+a2.hashCode());
		System.out.println(a3+" "+a3.hashCode());
		
		a1.add("karad");
		System.out.println(a1+" "+a1.hashCode());
		System.out.println(a2+" "+a2.hashCode());
		System.out.println(a3+" "+a3.hashCode());
		
		
		
	
	}
}

*/
/*

public class Day15_01 {

	public static void main(String[] args) 
	{
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("Akshita");
		a1.add("Sunbeam");
		a1.add("Pune");
		a1.add("HeadTechnical");
		a1.add("Trainer");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		
	
	}
}
*/



public class Day15_01 {

	public static void main(String[] args) 
	{
		ArrayList<Integer>a1=new ArrayList<Integer>();
		ArrayList<Integer>a2=new ArrayList<Integer>();
		a1.add(4);
		a1.add(5);
		a1.add(6);
		
		System.out.println(a1);
		a2.add(1);
		a2.add(2);
		a2.add(3);
		System.out.println(a2);
		System.out.println("Adding a1 inside a2 at index 1 ");
		a2.addAll(0, a1); //please insert a1 elements inside a2 from index 1 
		System.out.println(a2);
		
		System.out.println("Contains = "+a2.contains(6));
		System.out.println("Contains = "+a2.contains(16));
		
		System.out.println("index of element 3 = "+a2.indexOf(3));
		System.out.println(a2.remove(0));
		System.out.println("Before Sort " +a2);
		
		Collections.sort(a2);
		System.out.println("After Sort "+a2);
		
		
		
	}
}



/*
public class Day15_1 {

	public static void main(String[] args) 
	{
		ArrayList<Integer>a1=new ArrayList<Integer>();
		//Collection = ArrayList a1
		// ArrayList TypeParameter (E) = Integer
		//Collection? extends E
		// a1 ArrayList<Integer>
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		//Collection = ArrayList a2
		//TypeParameter a2 = Float
		//Requirement : add all the elements from a1 to a2
		a2.addAll(a1);
		System.out.println(a2);
		System.out.println("A1 Hashcode "+a1.hashCode());
		System.out.println("A2 Hashcode "+a2.hashCode());
		a2.add(40);
		System.out.println("A1 Hashcode "+a1.hashCode());
		System.out.println("A2 Hashcode "+a2.hashCode());
		
		
		
		
		
		
	}
}

*/


/*
public class Day15_1 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>(); //reference type
		int[] data= {10,12,13,45,20,44,66,88,11,22}; //value type 
		//data is an array of primitive type (sample data)
		//populate data[] inside array list
		
		//adding indivdiaul element inside AL from array
		for(int i:data)
			a1.add(i); //implicit conversion
		// int to Integer (AUTOBOXING)
		
		//System.out.println(a1);
		
		//printing the AL elements	
		
		System.out.println("Printing Array List 1 :");
		//i(int) = a1[0](Integer)   i=a1[1] .... 
		//for each element i of type int inside the ArrayList a1 of type Integer
		for(int i:a1)  // Integer to int conversion (AUTO UNBOXING)
			System.out.print(" "+i);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		
		//	addAll(Collection<? extends E> c)
		
		
		a2.addAll(a1);
		
		
		System.out.println("\n Printing Array List 2 :");
		
		for(int i:a2) 
			System.out.print(" "+i);
	}
}

*/



/*
public class Day15_1 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(5);
		a1.add(25);
		System.out.println(a1);
		a1.add(2,45);//please insert element 45 at location 2
		System.out.println(a1);
	}

}
*/
