package oops.polytopic.compiletime;

// 1) method arg count
// 2) method arg type
// 3) argument pramotional rule
public class TestApp1 
{
	void addFun()
	{
		System.out.println("ZERO args---void addFun()");
	}
	void addFun(int no1)
	{
		System.out.println("ONE args---void addFun(int no1)");
	}
	void addFun(int no1,int no2)
	{
		System.out.println("TWO inttype args---void addFun(int no1,int no2)");
	}
	void addFun(double no1,double no2)
	{
		System.out.println("TWO--doubletype args---void addFun(double no1,double no2)");
	}
	void addFun(int no1,int no2,int no3)
	{
		System.out.println("THREE args---void addFun(int no1,int no2,int no3)");
	}
	public static void main(String args[])
	{
		TestApp1 obj = new TestApp1();

		obj.addFun(10.5, 20.4);
	}
}
