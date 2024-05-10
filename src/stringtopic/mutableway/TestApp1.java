package stringtopic.mutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//------IMMUTABLE----------------------------------------------		
//		String name1 = "royal";
//		System.out.println("Name1 : " + name1 +  "---"+name1.hashCode());
//		name1 = name1.concat(" Techno");// royal Techno
//		System.out.println("Name1 : " + name1 +  "---"+name1.hashCode());
//----------------------------------------------------------------------------------

		//------MUTABLE----------------------------------------------		
//		StringBuffer name1 = new StringBuffer("royal");
//		System.out.println("Name1 : " + name1 +  "---"+name1.hashCode());
//		name1.append(" Techno");
//		System.out.println("Name1 : " + name1 +  "---"+name1.hashCode());
		
		
////------MUTABLE----------------------------------------------		
//		StringBuilder name1 = new StringBuilder("royal");
//		System.out.println("Name1 : " + name1 +  "---"+name1.hashCode());
//		name1.append(" Techno");
//		System.out.println("Name1 : " + name1 +  "---"+name1.hashCode());
		//------MUTABLE----------------------------------------------		
		StringBuffer name1 = new StringBuffer("abcd");

		System.out.println("Name1 : " +name1 ) ;
		name1.reverse();
		System.out.println("Name1 : " +name1 ) ;
	} 
}
