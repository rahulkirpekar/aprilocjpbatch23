package collectiontopic.sorttech.udo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1  = new Student(1, "rahul", 8);
		Student s2  = new Student(2, "amar", 9);
		Student s3  = new Student(3, "sagar", 10);
		Student s4  = new Student(4, "kunal", 11);
		Student s5  = new Student(5, "rakesh", 12);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Iterator<Student> itr = 	list.iterator();

		while(itr.hasNext()) 
		{
			Student s =	itr.next();
			System.out.println(s.getRno() + " "+s.getName()+" " + s.getStd());
		}
		
		Collections.sort(list);
		
		System.out.println("After Sorting : ");
		
		itr = 	list.iterator();

		while(itr.hasNext()) 
		{
			Student s =	itr.next();
			System.out.println(s.getRno() + " "+s.getName()+" " + s.getStd());
		}
	}
}









