package oops.abstopic.interfacetopic;

// interface---> 100%  abstraction
public interface Vehicle 
{
	// 1) Dm's---[public static final]
	int NO = 10;//public static final---CONSTANT
	
	// 2) abstract method---[public abstract]
	void getSpec();
	
	// 3) Non-abstract method
	//		--->static method---8
	static void test2() 
	{
	}
	//		--->default method---8
	default void test3() 
	{
	}
	//		--->private method---9
	private void test4() 
	{
	}
}