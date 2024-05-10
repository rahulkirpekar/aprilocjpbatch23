package stringtopic.smethods;

import java.time.LocalDate;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		
		LocalDate date =	LocalDate.of(2012, 1, 30);
		
		date.plusDays(10);
		
		System.out.println(date);
		
//		2012-01-30

		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Name : ");
//		String name = sc.nextLine();
//
//		boolean flag = true;
//		
//		for(int i = 0,j=(name.length() - 1) ; i<name.length() ; i++,j--) 
//		{
//			if (name.charAt(i) != name.charAt(j)) 
//			{
//				flag = false;
//				break;
//			}
//		}	
//		if(flag) 
//		{
//			System.out.println(name + " is  Palindrome.");	
//		}else 
//		{
//			System.out.println(name + " is not Palindrome.");	
//		}
	}
}
