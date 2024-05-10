package stringtopic.immutableway;

public class TestApp1 
{
	int TestApp1;
	private TestApp1() {
		// TODO Auto-generated constructor stub
	}
	private TestApp1(int no1) 
	{
		
	}
	public static void main(String[] args) 
	{
//		---> By String Literal Way:----RAM----HEAP---"String Constant Pool"
//		--------------------------------
//			String name1 = "royal";
//			String name2 = "royal";
//			String name3 = name1;
//			String name4 = "oracle";

			// object referenceBased Equality
//			System.out.println("name1==name2 : " + (name1==name2));//  true
//			System.out.println("name2==name3 : " + (name2==name3));//  true
//			System.out.println("name1==name4 : " + (name1==name4));//  

			// object valueBased Equality			
//			System.out.println("(name1.equals(name2) : " + (name1.equals(name2)));//  true
//			System.out.println("(name2.equals(name3) : " + (name2.equals(name3)));//  true
//			System.out.println("(name1.equals(name4) : " + (name1.equals(name4)));//  false
//-------------------------------------------------------------------------------------------------
		
		String name1 = new String("royal");
		String name2 = new String("royal");
		String name3 = name1;
		String name4 = new String("oracle");

		// object referenceBased Equality
		System.out.println("name1==name2 : " + (name1==name2));//  false
		System.out.println("name2==name3 : " + (name2==name3));//  false
		System.out.println("name1==name4 : " + (name1==name4));//  false

		// object valueBased Equality			
		System.out.println("(name1.equals(name2) : " + (name1.equals(name2)));//  true
		System.out.println("(name2.equals(name3) : " + (name2.equals(name3)));//  true
		System.out.println("(name1.equals(name4) : " + (name1.equals(name4)));//  false
	}
}
