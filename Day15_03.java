import java.util.ArrayList;


/*
class Student
{
	int rollno;
	int age;
	String name;
	
	Student(int rollno,int age,String name)
	{
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", age=" + age + ", name=" + name + "]";
	}
	
	
}

public class Day15_4 {

	public static void main(String[] args) 
	{
		Student s1=new Student(1,25,"P1"); //s1 non primitive object 
		Student s2=new Student(2,22,"P2");
		Student s3=new Student(3,30,"P3");
		
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(s1); //adding object in array list 
		a1.add(s2);
		a1.add(s3);
		
		System.out.println(a1);
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println("Rollno = "+a1.get(i).rollno+" Age "+a1.get(i).age+" Name = "+a1.get(i).name);
		}
		
		//for each student s inside arraylist a1 
		//display each student s 
		for(Student s:a1)
			System.out.println(s); //s.toString()
		
		System.out.println("Second Student Name  "+a1.get(1).name);
		//we can access AL elements in random way by using get() method 
		
		
		
		
		
		

	}

}

*/





class Student
{
	int rollno;
	int age;
	String name;
	
	Student(int rollno,int age,String name)
	{
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}

	
}

public class Day15_03 {

	public static void main(String[] args) 
	{
		Student s1=new Student(1,25,"P1"); //s1 non primitive object 
		Student s2=new Student(2,22,"P2");
		Student s3=new Student(3,30,"P3");
		
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(s1); //adding object in array list 
		a1.add(s2);
		a1.add(s3);
		
		System.out.println(a1);
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println("Rollno = "+a1.get(i).rollno+" Age "+a1.get(i).age+" Name = "+a1.get(i).name);
		}
		
		//for each student s inside arraylist a1 
		//display each student s 
		for(Student s:a1)
			System.out.println(s); //s.toString()
		
		System.out.println("Second Student Name  "+a1.get(1).name);
		//we can access AL elements in random way by using get() method 
		
		
		
		
		
		

	}

}
