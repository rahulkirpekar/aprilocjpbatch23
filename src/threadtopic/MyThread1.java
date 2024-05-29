package threadtopic;

public class MyThread1  extends Thread
{
	// Thread---job assigned to thread
	@Override
	public void run() 
	{
		for (int i = 1; i <= 3; i++) 
		{
			System.out.println(Thread.currentThread().getId() +"----"+Thread.currentThread().getName()+"---"+i);
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		// ---->
		System.out.println("START :: main method working as Thread----> "+Thread.currentThread().getName());
		MyThread1 th1 = new MyThread1();
		MyThread1 th2 = new MyThread1();
		MyThread1 th3 = new MyThread1();

		th1.setName("C Language");
		th2.setName("C++ Language");
		th3.setName("JAVA Language");
		
		th1.start();// Thread-0
//		th1.start();// Thread-0// raise--->IllegalThreadStateException
		
		th2.start();// Thread-1
		th3.start();// Thread-2
	}
}