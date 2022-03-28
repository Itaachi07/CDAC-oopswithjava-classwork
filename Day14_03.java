class Test1<T,U>
{
	T obj1; // field  // int i; //int is datatype i is variable //field  
	U obj2; // fields
	
	Test1(T obj1,U obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
	}
	
	void print()
	{
		System.out.println("Obj 1 = "+obj1+ " Obj 2 = "+obj2 );
	
	}
	
	
}


public class Day14_03 {

	public static void main(String[] args)
	{
		Test1 t1=new Test1(20,5.4f); //RAW TYPE 
		//if we don't specify the type parameter
		//while creating the object
		// then it is called as RAW TYPE 
		
		Test1<String,Integer> t2=new Test1<String,Integer>("Pratik",25);
		Test1<String,String>t3=new Test1<String,String>("Pratik","Sunbeam");
		Test1<Float,Integer> t4=new Test1<Float,Integer>(45.5f,2);
		t1.print();		//Obj 1 = 20 Obj 2 = 5.4
		t2.print(); 	//Obj 1 = Pratik Obj 2 = 25
		t3.print();		//Obj 1 = Pratik Obj 2 = Sunbeam
		t4.print();		//Obj 1 = 45.5 Obj 2 = 2
		
		

	}

}