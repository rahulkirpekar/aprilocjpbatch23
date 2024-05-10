package oops.pack.pack1;

import java.util.Scanner;

public class Student 
{
	// 1) Data members
	 protected int rno;
	 protected String name;
	 protected int std;
	
	// 2) Member Function
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno + " " + name + " " + std);
	}
}
