package oops.executionflow;

public class Student 
{
	int rno;
	String name;
	int std;
	
	// Static Block
	static
	{
		System.out.println("START :: Static BLOCK");
		
		System.out.println("EXIT :: Static BLOCK");
	}
	// Instance Block
	{
		System.out.println("START :: INSTANCE BLOCK");
		rno=1;
		name="rahul";
		std=12;
		System.out.println("EXIT :: INSTANCE BLOCK");
	}
	public Student() 
	{
		System.out.println(rno + " " +name +  " "+ std);
	}
	public void dispData() 
	{
		System.out.println(rno + " " +name +  " "+ std);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
	}
}





