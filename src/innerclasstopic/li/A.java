package innerclasstopic.li;

public class A 
{
	private int no = 100;
	
	void test()
	{
		// Local Innerclass
		class B
		{
			void msg() 
			{
				System.out.println("test--->B--->NO : " + no);
			}
		}
		B obj = new  B();
		obj.msg();
	}
	public static void main(String[] args) 
	{
		A obj = new A();
		obj.test();
	}
}
