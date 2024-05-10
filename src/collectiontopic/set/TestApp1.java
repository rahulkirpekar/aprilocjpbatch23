package collectiontopic.set;

import java.util.TreeSet;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeSet<String>setObj = new TreeSet<String>();
		setObj.add("rahul");
		setObj.add("ajay");
		setObj.add("rakesh");
		setObj.add("manan");
		setObj.add("kavish");
		setObj.add("rahul");
		setObj.add("rakesh");
		setObj.add("manan");
		setObj.add("sagar");
		
		Iterator<String> itr =	setObj.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}
