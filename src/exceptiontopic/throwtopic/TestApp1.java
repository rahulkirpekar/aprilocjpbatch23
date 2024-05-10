package exceptiontopic.throwtopic;

import java.sql.SQLException;
import java.util.Scanner;

public class TestApp1 
{
	public static void isValidForVote(int age) throws SQLException,InvalidAgeException
	{
		if(age < 18) 
		{
			// raise exception---Runtime/CompileTime
			throw new InvalidAgeException("\n\"Invalid Input,\n\t\tPlease enter age greater than 18\"");
		}else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		try 
		{
			isValidForVote(age);
			
		} catch (InvalidAgeException | SQLException e) 
		{
			e.printStackTrace();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}  
		System.out.println("After in main method");
	}
}