package oops.inhtopic.mli;

public class C extends B
{
	int no3;
	public static void main(String[] args) 
	{
		C obj=new C();
		
		obj.no1=10;
		obj.no2=20;
		obj.no3=30;
		
		
		System.out.println(obj.no1 + " " + obj.no2 +  " " + obj.no3);
		
	}
}
