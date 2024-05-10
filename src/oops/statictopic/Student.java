package oops.statictopic;

import java.util.Scanner;

public class Student 
{
	int rno;
	String name;
	int std;
	static String schoolName;
	
	public static void setSchoolName() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter SchoolName : ");
		schoolName = sc.nextLine();
	}
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
		System.out.println(rno + " " +name + " " + std + " " + schoolName);
	}
	public static void main(String[] args) 
	{
		Student.setSchoolName();
		
		Student s1 = new Student();//  rno name std
		Student s2 = new Student();//  rno name std
		
		s1.scanData();		
		s2.scanData();
		
		s2.setSchoolName();
		
		s1.dispData();
		s2.dispData();
		
	}
}
