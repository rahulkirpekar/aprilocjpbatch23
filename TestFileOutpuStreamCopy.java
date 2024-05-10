package iotopic.byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestFileOutputStream 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();// abc
		
		//			string data --->ASCII(byte)
		byte b[] = name.getBytes();
		
//		1) Byte oriented way====> (String)Data ----> name ---> WRITE in FILE
		FileOutputStream fout =  null;
		try 
		{
			fout = new FileOutputStream("test1.txt");
		
			fout.write(b);
			
			System.out.println("Success");
			
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
				fout.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}