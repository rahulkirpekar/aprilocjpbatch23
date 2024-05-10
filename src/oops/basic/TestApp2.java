package oops.basic;

public class TestApp2 
{
	// var args --- variable arguments
	public void test1(int no,int...a ) 
	{
		System.out.println("No : " + no);
		for (int i = 0; i < a.length; i++) 
		{                                  
			System.out.println("a["+i+"] : " + a[i]);    
		}                                  
		
//		int sum=0;
//		for (int i = 0; i < a.length; i++) 
//		{
//			sum=sum+a[i];
//		}
//		System.out.println("Addition : " + sum);
	}
	public static void main(String[] args) 
	{
		TestApp2 obj = new TestApp2();
		
		obj.test1(10,20,30,40,50,60,70,80,90,100);
		
	}
}
