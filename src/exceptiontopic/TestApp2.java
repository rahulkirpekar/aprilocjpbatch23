package exceptiontopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		// exception handled--Nested try...catch
		int ans = 0;
		try 
		{
			try 
			{
				ans = no1 / no2;// ArithmeticException
			} catch (Exception e) 
			{
				e.printStackTrace();
			}finally 
			{
				System.out.println("first finally block");
			}
			try 
			{
				String name = "abc";
				System.out.println("name.length() : " + name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}finally 
			{
				System.out.println("second finally block");
			}
			try 
			{
				int a[] = new int[5];
				a[5] = 100;
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}finally 
			{
				System.out.println("third finally block");
			}
		}catch(ArithmeticException | NullPointerException e) 
		{
			System.out.println("Exception Handled---1");
			e.printStackTrace();
		}catch(Exception e) 
		{
			System.out.println("Exception Handled---4");
			e.printStackTrace();
		}finally 
		{
			System.out.println("HI I am Outer Finally Block");
		}
		System.out.println("Addition : " + ans);
	}
}