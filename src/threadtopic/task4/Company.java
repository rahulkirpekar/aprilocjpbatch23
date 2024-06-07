package threadtopic.task4;

public class Company 
{
	int n;
	
	boolean f= false;
	
	//  f = false : chance : producer
	// f  = true : chance : consumer
	
	public synchronized void produce_Item(int n) 
	{
		if(f) 
		{
			try 
			{
				wait();
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println("Produced Item : " + this.n);

		f = true;
		notify();
	}
	public synchronized int consume_Item() 
	{
		if(!f) 
		{
			try 
			{
				wait();
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Consumed Item : " + this.n);
		f = false;
		notify();
		return this.n;
	}
}
