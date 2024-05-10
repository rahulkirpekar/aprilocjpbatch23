package iotopic.byteorientedway.seritopic;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestObjWrite 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		try 
		{
			FileOutputStream fout =new FileOutputStream("studlist.txt");

			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			// serialized---obj---file---write
			out.writeObject(s1);
			
			System.out.println("success");
			
			out.close();
			fout.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}