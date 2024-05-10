package stringtopic.objequality;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 10);
		Student s2 = new Student(2, "rahul", 12);
		
		
		System.out.println("s1==s2 : " + (s1==s2));
		System.out.println("(s1.equals(s2) : " + (s1.equals(s2)));
		System.out.println("s1 : " + s1.toString());
	
		String name1 = "rahul";
		String name2 = "rahul";
		System.out.println("name1==name2 : " + (name1==name2));
		System.out.println("(name1.equals(name2) : " + (name1.equals(name2)));
		System.out.println("name1 : " + name1.toString());
		
	}
}
