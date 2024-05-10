package oops.encap;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		
//		s.rno = 1;
//		s.name="rahul";
//		s.std=12;
		
		s.setRno(1);
		s.setName("Rahul");
		s.setStd(12);

		System.out.println("s.getRno() : " +s.getRno());
		System.out.println("s.getName() : " +s.getName());
		System.out.println("s.getStd() : " +s.getStd());
		
	}
}
