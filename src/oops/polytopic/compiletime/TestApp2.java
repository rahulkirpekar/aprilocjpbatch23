package oops.polytopic.compiletime;

public class TestApp2 
{
	void addFun(long no1)
	{
		System.out.println("ONE longtype args---void addFun(int no1)---"+no1);
	}
	void addFun(double no1)
	{
		System.out.println("ONE doubletype args---void addFun(int no1)---"+no1);
	}
//	void addFun(short no1)
//	{
//		System.out.println("ONE short args---void addFun(int no1)---"+no1);
//	}
//	void addFun(byte no1)
//	{
//		System.out.println("ONE byte args---void addFun(int no1)---"+no1);
//	}
//	void addFun(long no1,long no2)
//	{
//		System.out.println("TWO longtype args---void addFun(int no1,int no2)");
//	}
//	void addFun(double no1,double no2)
//	{
//		System.out.println("TWO--doubletype args---void addFun(double no1,double no2)");
//	}
//	void addFun(int no1,int no2,int no3)
//	{
//		System.out.println("THREE args---void addFun(int no1,int no2,int no3)");
//	}
	public static void main(String[] args) 
	{
		TestApp2 obj = new TestApp2();
		
		obj.addFun('r');
		
	}

}
/*
class Adder
{  
	static int add(int a,int b)
	{
		return a+b;
	}  
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}  
}  
class TestOverloading1
{  
	public static void main(String[] args)
	{  
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(11,11,11));  
	}
}
--------------------------------------------------
class Adder
{  
	static int add(int a, int b)
	{
		return a+b;
	}  
	static double add(double a, double b)
	{
		return a+b;
	}  
}  
class TestOverloading2
{  
	public static void main(String[] args)
	{  
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(12.3,12.6));  
	}
} 
-------------------------------------------------
class Adder
{ 	 
	static int add(int a,int b)
	{
		return a+b;
	}  
	static double add(int a,int b)
	{
		return a+b;
	}  
}  
class TestOverloading3
{  
	public static void main(String[] args)
	{  
		System.out.println(Adder.add(11,11));//ambiguity  --->C.E
	}
}  
---------------------------------------------------
class TestOverloading4{  
public static void main(String[] args){System.out.println("main with String[]");}  
public static void main(String args){System.out.println("main with String");}  
public static void main(){System.out.println("main without args");}  
}  
----------------------------------------------------
Example of Method Overloading with TypePromotion
class OverloadingCalculation1{  
  void sum(int a,long b){System.out.println(a+b);}  
  void sum(int a,int b,int c){System.out.println(a+b+c);}  
  
  public static void main(String args[]){  
  OverloadingCalculation1 obj=new OverloadingCalculation1();  
  obj.sum(20,20);//now second int literal will be promoted to long  
  obj.sum(20,20,20);  
  
  }  
}  
------------------------------------------------------------------
Example of Method Overloading with Type Promotion if matching found
If there are matching type arguments in the method, type promotion is not performed.

class OverloadingCalculation2{  
  void sum(int a,int b){System.out.println("int arg method invoked");}  
  void sum(long a,long b){System.out.println("long arg method invoked");}  
  
  public static void main(String args[]){  
  OverloadingCalculation2 obj=new OverloadingCalculation2();  
  obj.sum(20,20);//now int arg sum() method gets invoked  
  }  
}  
----------------------------------------------------------------------
class OverloadingCalculation3{  
  void sum(int a,long b){System.out.println("a method invoked");}  
  void sum(long a,int b){System.out.println("b method invoked");}  
  
  public static void main(String args[]){  
  OverloadingCalculation3 obj=new OverloadingCalculation3();  
  obj.sum(20,20);//now ambiguity  
  }  
}  







*/