package collectiontopic.list.al;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// 1) SIZE
		// 2) TYPE----->SAFE(SINGLE SAME TYPE)
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(12);
		list.add(65);
		list.add(90);

		/*  
		   for (int i = 0; i < list.size(); i++) 
			{
				int value = list.get(i);
				
				System.out.println("value : " + value);
			}
		 */
		
/*		for(Integer value : list) 
		{
			System.out.println("value : " + value);
		}
*/
		
		Iterator<Integer> itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			Integer i = itr.next();
			System.out.println(i);
		}
	}
}
