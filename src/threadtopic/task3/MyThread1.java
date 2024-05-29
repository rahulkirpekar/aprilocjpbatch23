package threadtopic.task3;

public class MyThread1 extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 1; i <=5; i++) 
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getId()+"----"+Thread.currentThread().getName()+"===="+i);
		}
	}

	public static void main(String[] args) 
	{
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		MyThread1 t3 = new MyThread1();
		MyThread1 t4 = new MyThread1();
		MyThread1 t5 = new MyThread1();
		
		t1.start();
		
		try 
		{
			// t1.join();
			
			t1.join(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}
