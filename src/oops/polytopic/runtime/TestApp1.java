package oops.polytopic.runtime;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Choice");
		System.out.println("1) For Student");
		System.out.println("2) For Employee");
		int choice = new Scanner(System.in).nextInt();
		Person p = null;
		switch(choice) 
		{
			case 1: p = new Student();
					p.getPersonLocaltion();
					break;
					
			case 2: p = new Employee();
					p.getPersonLocaltion();
					break;		
		}
	}
}
