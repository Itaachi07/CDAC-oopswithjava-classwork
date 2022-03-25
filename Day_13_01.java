import java.util.Scanner;

public class Day_13_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		int result;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter First Number ");
			a=sc.nextInt();
			System.out.println("Enter Second Number ");
			b=sc.nextInt();
			result=a/b;	
			System.out.println("Result = "+result);
		}
		catch(Exception e)
		{
			//System.out.println(e);
			//System.out.println(e.toString());
			//System.out.println("second number can not be zero");
			//System.out.println(e.getMessage());
			//System.out.println(e.getCause());
			//System.out.println(e.getClass());
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("inside the final block");
			sc.close();
			System.out.println("thank you for coding ");
		}
	}

	}


