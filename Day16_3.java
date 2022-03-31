import java.util.ArrayList;

public class Day16_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1 +"\n Class "+a1.getClass());
		
		Object[] intArr = a1.toArray(); 
		for(int i=0;i<intArr.length;i++)
			System.out.println(intArr[i]);
		
		System.out.println("intArr Class "+intArr.getClass());
	}

}
