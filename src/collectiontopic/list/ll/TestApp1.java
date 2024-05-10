package collectiontopic.list.ll;

import java.util.LinkedList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer>list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(12);
		list.add(65);
		list.add(90);
	
		
		Iterator<Integer> itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			Integer i = itr.next();
			System.out.println(i);
		}
	}

}
