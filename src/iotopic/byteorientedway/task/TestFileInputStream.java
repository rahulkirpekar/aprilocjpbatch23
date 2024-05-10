package iotopic.byteorientedway.task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputStream 
{
	public static void main(String[] args) 
	{
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\aprilocjpbatch23\\src\\iotopic\\byteorientedway\\TestFileOutputStream.java");
			fout = new FileOutputStream("TestFileOutpuStreamCopy.java");
			int temp;
			
			while(	(temp = fin.read())	!= -1) 
			{
				fout.write(temp);
				System.out.print((char)temp);
				
			}
			System.out.println("success");
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
				fout.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
