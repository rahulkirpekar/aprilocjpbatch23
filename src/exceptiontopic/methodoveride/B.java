package exceptiontopic.methodoveride;

import java.io.IOException;

public class B extends A
{
	@Override
	public void test() throws Exception
	{
		System.out.println("B--test()");
	}
}
