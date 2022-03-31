import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.Enumeration;

public class Day16_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v= new Vector<String>(5);
		v.add("Pratik Satpute");
		System.out.println(v+" Size: "+v.size()+" Capacity:" +v.capacity());
		v.add("Satara");
		v.add("Sunbeam");
		v.add("Powai naka");
		System.out.println(v+"\n\t Size: "+v.size()+" Capacity:" +v.capacity());
		v.add("6556");
		System.out.println(v+"\n\t Size: "+v.size()+" Capacity:" +v.capacity());
		v.add("26 Samata");
		System.out.println(v+"\n\t Size: "+v.size()+" Capacity:" +v.capacity());
		//Iterator itr =v.iterator();
		/* while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");// concurrent modification exception
			v.addElement("java");
		}*/
		/*
		ListIterator itr1 =v.listIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next()+" ");
		}*/
		Enumeration e= v.elements();
		while (e.hasMoreElements()){
			System.out.println(e.nextElement()+" ");
			//v.add("java");
			
		}System.out.println("\n using for each");
		for(String i:v)
			System.out.print(" " +i);
	}

}
