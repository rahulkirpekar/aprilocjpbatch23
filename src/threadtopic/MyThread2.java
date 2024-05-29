package threadtopic;

//2) By implementing 'Runnable' interface
//***************************************
public class MyThread2 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Hi I m Thread : " + Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		MyThread2 resource = new MyThread2();
		
		Thread t1 = new Thread(resource);
		Thread t2 = new Thread(resource);
		Thread t3 = new Thread(resource);
		Thread t4 = new Thread(resource);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
