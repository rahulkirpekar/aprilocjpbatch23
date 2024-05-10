package basic.arraytopic;

import java.util.Scanner;

public class Student 
{
	int rno;
	String name;
	int std;
	
	public static void main(String[] args) 
	{
		Student s[] = new Student[5];
		System.out.println("Student Array Object : " + s);
		for(int i = 0 ; i < s.length ; i++) 
		{
			// i - 0,1,2,3,4
			s[i] = new Student();
			s[i].scan();
		}
		for(int i = 0 ; i < s.length ; i++) 
		{
			s[i].disp();
		}
	}
	private void disp() 
	{
		System.out.println(rno + "  "+name + " " +std+"----"+this);
	}

	private void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : " );
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : " );
		name = sc.nextLine();
		System.out.println("Enter Std : " );
		std = sc.nextInt();
	}
	
}
