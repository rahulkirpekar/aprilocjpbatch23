package basic.arraytopic;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		int a[] = new int[5];// VALID
//		int []a = new int[5];// VALID
//		int[] a = new int[5];// VALID
		int a[] ;
		a = new int[5]; // VALID
		
		System.out.println("Size of Array : " + a.length);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+ i +"] : " + a[i]);
		}
//		sc.close();
	}// sc a[] object --release---GC
}
