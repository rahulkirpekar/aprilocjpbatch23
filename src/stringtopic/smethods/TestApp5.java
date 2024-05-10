package stringtopic.smethods;

import java.util.Scanner;
public class TestApp5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter First String : ");
//		String firstString = sc.nextLine();// This is Java which is developed by James Gosling.
		
//		System.out.println("Enter Second String : ");
//		String secondString = sc.nextLine();// Gosling.

//		[firstString & secondString] value compare
//		System.out.println("firstString.equals(secondString) : " + firstString.equals(secondString));
		// abc----ABC--true
//		System.out.println("firstString.equalsIgnoreCase(secondString) : " + firstString.equalsIgnoreCase(secondString));
//		System.out.println("firstString.endsWith(secondString) : " + firstString.endsWith(secondString));

//		String val1="Java";
//		String val2="C++";
		String value1  = String.format("This is No1 Value : %f",10.4324f);
		String value2  = String.format("This is No2 Value : %f",3243.34f);
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		
	}
}
