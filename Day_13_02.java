import java.util.Scanner;
public class Day_13_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
		
		try(Scanner sc=new Scanner(System.in)) //try block handler / try with resources 
		{
		
		System.out.println("Enter First Number ");
		a=sc.nextInt();
		System.out.println("Enter Second Number ");
		b=sc.nextInt();
		
		
			int result=a/b;
			System.out.println("Result "+result);
		
		}
		
		finally
		{
			System.out.println("inside finally block");
		}

	}
}
