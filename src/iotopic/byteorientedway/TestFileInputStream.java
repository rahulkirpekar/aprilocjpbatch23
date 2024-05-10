package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream 
{
	public static void main(String[] args) 
	{
//		String value = "";
		StringBuilder sb = new StringBuilder();
		FileInputStream fin = null;
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\aprilocjpbatch23\\test1.txt");

			int temp;
			
			while(	(temp = fin.read())	!= -1) 
			{
//				char c = (char)temp;
//				String n = "" + c;
//				value = value.concat(n);
				
				sb.append((char)temp);
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}finally 
		{
			try 
			{
				fin.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
//		System.out.println("Final String : " + value);
		System.out.print("Final String : " + sb.toString());
	}
}
