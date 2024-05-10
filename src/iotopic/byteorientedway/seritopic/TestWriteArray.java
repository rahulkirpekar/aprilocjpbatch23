package iotopic.byteorientedway.seritopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestWriteArray 
{
	public static void main(String[] args) 
	{
		Student s[] = new Student[5];
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		try 
		{
			FileOutputStream fout  = new FileOutputStream("list.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s);
			out.close();
			fout.close();
			System.out.println("success");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
