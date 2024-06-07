package threadtopic.task4;

public class Consumer extends Thread
{
	Company c;
	public Consumer(Company c) 
	{
		this.c = c;
	}
	@Override
	public void run() 
	{
		while(true) 
		{
			this.c.consume_Item();
			try 
			{
				Thread.sleep(1000);
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
