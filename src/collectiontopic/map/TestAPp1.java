package collectiontopic.map;

import java.util.TreeMap;
import java.util.Map;

public class TestAPp1 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> mapObj = new TreeMap<Integer, String>();
		
		mapObj.put(5, "harish");// 
		mapObj.put(1, "rakesh");// <=== entry--data--[K,V]
		mapObj.put(3, "krunal");// 
		mapObj.put(2, "sagar");// 
		mapObj.put(4, "ramesh");// 

		for(Map.Entry<Integer,String> e	:	mapObj.entrySet()) 
		{
			System.out.println(e.getKey()+"----"+e.getValue());
		}
	}
}
