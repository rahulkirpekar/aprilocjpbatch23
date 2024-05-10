package iotopic.byteorientedway.seritopic;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestReadObj 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\aprilocjpbatch23\\studlist.txt");
		
			ObjectInputStream oin = new ObjectInputStream(fin);

			// deserialised
			// text--(data)read---program--access
			Object obj = oin.readObject();
			
			Student s = (Student)obj;
			
			s.dispData();
			
			oin.close();
			fin.close();
			
			System.out.println("success");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}