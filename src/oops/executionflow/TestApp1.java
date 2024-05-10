package oops.executionflow;

public class TestApp1 
{
	// 1) static block---1
	static
	{
		System.out.println("1) Static BLock---1");
	}
	// 1) static block---2
	static
	{
		System.out.println("1) Static BLock---2");
	}
	
	// 2) Instance Block---1
	{
		System.out.println("4) Instance Block---1");
	}
	// 2) Instance Block---2
	{
		System.out.println("4) Instance Block---2");
	}
	// Default Constructor
	public TestApp1() 
	{
		System.out.println("5) Default Constructor");
	}
	// Para Constructor
	public TestApp1(int no1) 
	{
		System.out.println("5) Para Constructor");
	}
	// static method
	public static void testStatic() 
	{
		System.out.println("3) Static Method");
	}
	// Non-static method
	public void test() 
	{
		System.out.println("6) NonStatic Method");
	}
	public static void main(String[] args) 
	{
		System.out.println("2) START :: Main Method");
		TestApp1.testStatic();
		TestApp1 obj1 = new TestApp1();
		TestApp1 obj2 = new TestApp1();
		obj1.test();
		obj2.test();
		
		System.out.println("7) EXIT :: Main Method");
	}
}
