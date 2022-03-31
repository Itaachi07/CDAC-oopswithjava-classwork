import java.util.Vector;
import java.util.Scanner;
public class Day16_5 {

	public static void main(String[] args) {
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
		System.out.println(v.get(4));
		System.out.println(v.firstElement());
		System.out.println(v.hashCode());
		
	}

}
