package stringtopic.smethods;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name1 : ");
		String name1 = sc.nextLine();// rahul
		System.out.println("Enter Name2 : ");
		String name2 = sc.nextLine();// kirpekar
		
					   //rahul     
		String name3 = 	name1.concat(" ");// rahul 
		
		System.out.println(name1.hashCode() + " " + name1);
		System.out.println(name2.hashCode() + " " + name2);
		System.out.println(name3.hashCode() + " " + name3);
		
		name3 = name3.concat(name2);
 		System.out.println(name1.hashCode() + " " + name1);
		System.out.println(name2.hashCode() + " " + name2);
		System.out.println(name3.hashCode() + " " + name3);
	}
}
