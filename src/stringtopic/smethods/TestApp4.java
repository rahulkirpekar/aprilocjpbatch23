package stringtopic.smethods;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name1 : ");
		String name1 = sc.nextLine();// rahul
		System.out.println("Enter Name2 : ");
		String name2 = sc.nextLine();// kirpekar
		
		if (name1.contains(name2)) 
		{
			System.out.println("Name2 is avaiable in name1");
		} else 
		{
			System.out.println("Name2 is not avaiable in name1");
		}
	}
}
