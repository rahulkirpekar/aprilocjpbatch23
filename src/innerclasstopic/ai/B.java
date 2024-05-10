package innerclasstopic.ai;

public class B 
{
	public static void main(String[] args) 
	{
		A obj = new A() 
		{
			@Override
			public void test() 
			{
				System.out.println("A----test()");
			}
		};
		
		obj.test();
		
	}
}
