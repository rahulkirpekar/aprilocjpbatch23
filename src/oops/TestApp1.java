package oops;

public class TestApp1 
{
	public static void main(String...args) 
	{
		int sum = 0 ;
		for (int i = 0; i < args.length; i++) 
		{
			char no = args[0].charAt(0);
			
			sum = sum + no;
			
			System.out.println("args["+i+"] : " + args[i]);
		}
		System.out.println("Sum : " + sum);
	}
}
