package innerclasstopic.mi;

public class A 
{
	private int no = 100;
	// 1) Member Innerclass
	class B
	{
		void msg() 
		{
			System.out.println("No : " + no);
		}
	}
	public static void main(String[] args) 
	{
		A outerObj = new A();
		
		A.B innerObj = outerObj. new B();
		
		innerObj.msg(); 
	}
}
