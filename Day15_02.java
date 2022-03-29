import java.util.ArrayList;

public class Day15_02 
{
	
	public static ArrayList<Integer> generateIntAL()
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		return a1;
	}
	
	public static ArrayList<Float> generateFloatAL()
	{
		ArrayList<Float> a2=new ArrayList<Float>();
		a2.add(10.5f);
		a2.add(20.5f);
		a2.add(30.5f);
		return a2;
	}
	
	public static ArrayList<Double> generateDoubleAL()
	{
		ArrayList<Double> a3=new ArrayList<Double>();
		a3.add(3.3);
		a3.add(4.4);
		a3.add(5.5);
		return a3;
	}
	
	public static ArrayList<String> generateStringAL()
	{
		ArrayList<String> a4=new ArrayList<String>();
		a4.add("Akshita");
		a4.add("Sunbeam");
		a4.add("Pune");
		return a4;
	}
	
	public static void printList(ArrayList<?> list) //unbounded wild card
	{
		for(Object o:list)
			System.out.print(" "+o);
	}
	

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> il=new ArrayList<Integer>();
		il=generateIntAL();
		
		ArrayList<Float> fl=new ArrayList<Float>();
		fl=generateFloatAL();
		
		ArrayList<Double> dl=new ArrayList<Double>();
		dl=generateDoubleAL();
		
		ArrayList<String> sl=new ArrayList<String>();
		sl=generateStringAL();
		
		System.out.println("printing integer AL");
		printList(il);
		System.out.println("\n printing float AL");
		printList(fl);
		System.out.println("\n printing double AL");
		printList(dl);
		System.out.println("\n printing String AL");
		printList(sl);

	}

}
