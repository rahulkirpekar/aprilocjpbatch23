package collectiontopic.list.vctr;

import java.util.Vector;
import java.util.Iterator;
import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(2, "kunal", 12);
		Student s3 = new Student(3, "adi", 10);
		Student s4 = new Student(4, "dev", 12);
		
		Vector<Student> list = new Vector<Student>();
		
		list.add(s1);//0
		list.add(s2);//1
		list.add(s3);//2
		list.add(s4);//3
		
		Iterator<Student> itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		boolean flag= true;
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			
			if(s.getName().equals(name)) 
			{
				list.remove(i);
				System.out.println("Student record successfully Deleted");
				flag = false;
				break;
			}
		}
		if(flag) 
		{
			System.out.println("Given Name - "+name+"  not found in Student records");
		}
//----------------------------------------------------------------------------------------------		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Rno : ");
//		int rno = sc.nextInt();
//		boolean flag = true;
//		for (int i = 0; i < list.size(); i++) 
//		{
//			Student s = list.get(i);
//			
//			if(s.getRno() == rno) 
//			{
//				sc.nextLine();
//				System.out.println("Enter Name : ");
//				String name = sc.nextLine();
//				System.out.println("Enter Std : ");
//				int std = sc.nextInt();
//				
//				Student sobj = new Student(rno, name, std);
//				
//				list.set(i, sobj);
//				System.out.println("Student record successfully Updated");
//				flag = false;
//				break;
//			}
//		}
//		if(flag) 
//		{
//			System.out.println("Given Rno - "+rno+"  not found in Student records");
//		}
//----------------------------------------------------------------------------------------------		
		itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
	}
}