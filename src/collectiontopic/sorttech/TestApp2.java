package collectiontopic.sorttech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new  ArrayList<String>();
		
		list.add("rakesh");
		list.add("amar");
		list.add("kunal");
		list.add("sagar");
		list.add("rahul");

		Iterator<String> itr = list.iterator();
				
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
		Collections.sort(list);
		
		System.out.println("After Sorting : ");
		
		itr = list.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
