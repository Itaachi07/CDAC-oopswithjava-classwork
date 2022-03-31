import java.util.Iterator;
import java.util.Vector;
public class Day16_6 {

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
		Iterator itr =v.iterator();
		for(Object o:v) 
			System.out.println(o);
	
	}

}
