package collectiontopic.list.al;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("rahul");//0--string <===itr
		list.add(10);//1--int----Integer(class)----object---10 store value
		list.add(12L);//2--long---Long
		list.add('R');//3--character--Character
		list.add(true);//4--boolean--Boolean
		list.add(23.32);//5--double---Double
		list.add(65.234f);//6--float---Float
		
		
		Student s = new  Student(1, "rahul", 12);
		list.add(s);
		
		System.out.println("list.size() : " + list.size());// 7
		
		System.out.println("list.get(0) : " + list.get(0));
		System.out.println("list.get(1) : " + list.get(1));
		
//		// 1) Normal for loop
//		
//		for(int i = 0 ; i < list.size();i++) 
//		{
//			Object obj = list.get(i);
//			
//			if (obj instanceof Student) 
//			{
//				Student sobj = (Student)obj;
//				sobj.disp();
//			} else 
//			{
//				System.out.println(obj);
//			} 
//		}
		
		
		// 2) for each loop
		
//		for( Object obj	:	list) 
//		{
//			if (obj instanceof Student)       
//			{                                 
//				Student sobj = (Student)obj;     
//				sobj.disp();                     
//			} else                            
//			{                                 
//				System.out.println(obj);         
//			}                                 
//		}

		// 3) list iterator way
		
		Iterator itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if (obj instanceof Student)             
			{                                       
				Student sobj = (Student)obj;        
				sobj.disp();                        
			} else                                  
			{                                       
				System.out.println(obj);            
			}                                       
		}
		
	}
}