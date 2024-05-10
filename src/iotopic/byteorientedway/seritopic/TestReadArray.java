package iotopic.byteorientedway.seritopic;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestReadArray 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\aprilocjpbatch23\\list.txt") ;
			ObjectInputStream oin = new ObjectInputStream(fin);

			Student s[] = (Student[])oin.readObject();

			for (int i = 0; i < s.length; i++) 
			{
				s[i].dispData();
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
