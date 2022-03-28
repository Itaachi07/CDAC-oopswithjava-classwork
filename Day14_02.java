// <T> is type parameter
// specifying the type 
// Generics 

//if you are specifying the generic type in front of classname
// we say it is generic class

class Test<T> // Class as generic class 
{
	T obj;
	Test(T obj)
	{
		this.obj=obj;
	}
	
	public T getObj() //method is having return type as type parameter T 
	{
		return this.obj;
	}
}

public class Day14_02 
{

	public static void main(String[] args) 
	{
		Test<Integer> t1=new Test<Integer>(123);
		
		Test<Float>t2=new Test<Float>(5.5f);
		System.out.println(t1.getObj());			//123
		System.out.println("Class T1 = "+t1.getClass()); //class test
		
		System.out.println(t2.getObj());  //5.5
		System.out.println("Class T2 = "+t2.getClass()); //class test
		
		
		
		Test t3=new Test("Pratik"); 		//t3 is Raw Type 
		//when you donot specify the type parameter (RAW TYPE)
		System.out.println(t3.getObj()); 					//Pratik
		System.out.println(t3.getClass());					//Class test
		System.out.println(t3.getClass().getName()); 		//test
		
		
	}
	
	

}
