
class NumberIsGreaterException extends Exception
{
	NumberIsGreaterException()
	{
		System.out.println("User Exception Occured");
	}
	
}

public class Day_13_04
{

	public static void main(String[] args) 
	{
		try
		{
		int m=Integer.parseInt(args[0]);
			if(m>100)
			{
				throw new NumberIsGreaterException();
			}
		}
		catch(NumberIsGreaterException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
	}

}