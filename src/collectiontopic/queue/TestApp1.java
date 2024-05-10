package collectiontopic.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String>queueObj = new PriorityQueue<String>();
		queueObj.add("rahul");//<==queueObj
		queueObj.add("ajay");
		queueObj.add("rakesh");
		queueObj.add("manan");
		queueObj.add("kavish");
		queueObj.add("rahul");
		queueObj.add("rakesh");
		queueObj.add("manan");
		queueObj.add("sagar");
		
//	Sorted Data--iterate
//		while(!queueObj.isEmpty()) 
//		{
//			String name = queueObj.poll();
//			System.out.println(name);
//		}
//----------------------------------------------------------
//		Iterator<String> itr =	queueObj.iterator();
//		
//		while(itr.hasNext()) 
//		{
//			String name = itr.next();
//			System.out.println(name);
//		}
	}
}
