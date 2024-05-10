package collectiontopic.sorttech.udo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Employee e1  = new Employee(1, "rahul",9000);
		Employee e2  = new Employee(2, "amar",  8000);
		Employee e3  = new Employee(3, "sagar", 11000);
		Employee e4  = new Employee(4, "kunal", 10000);
		Employee e5  = new Employee(5, "rakesh", 12000);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Iterator<Employee> itr = 	list.iterator();

		while(itr.hasNext()) 
		{
			Employee e =	itr.next();
			System.out.println(e.getId() + " "+e.getName()+" " + e.getSalary());
		}
		
		Collections.sort(list, new SalaryWiseEmployeeComparator());
		
		System.out.println("After Salary Sorting : ");
		
		itr = 	list.iterator();

		while(itr.hasNext()) 
		{
			Employee e =	itr.next();
			System.out.println(e.getId() + " "+e.getName()+" " + e.getSalary());
		}
		
		Collections.sort(list, new NameWiseEmployeeComparator());
		
		System.out.println("After Name Sorting : ");
		
		itr = 	list.iterator();

		while(itr.hasNext()) 
		{
			Employee e =	itr.next();
			System.out.println(e.getId() + " "+e.getName()+" " + e.getSalary());
		}		
		
	}
}









