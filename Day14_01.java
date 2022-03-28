class Box
{
	Object obj; //obj is field of class Box 
	//obj is of type Object class type 

	public Object getObj() //getter 
	{
		return obj;
	}

	public void setObj(Object obj)  //setter 
	{
		this.obj = obj;
	}
	
	
}

public class Day14_01 
{

	public static void main(String[] args) 
	{
		Box b1=new Box();
		b1.setObj(123);
		Integer n1=(Integer)b1.getObj();
		System.out.println("N1 = "+n1);
		System.out.println("N1 get class "+n1.getClass());
		
		
		Box b2=new Box();
		b2.setObj(43.356f);
		Float f1=(Float)b2.getObj();
		//Interger ref = (Integer)Object; // Allowed (DOWNCASTING)
		System.out.println("f1 = "+f1);
		System.out.println("f1 get class "+f1.getClass());
		
		Box b3=new Box();
		b3.setObj(4.5);
		Double d1=(Double)b3.getObj();
		System.out.println("d1 = "+d1);
		System.out.println("d1 get class "+d1.getClass());
		

	}

}