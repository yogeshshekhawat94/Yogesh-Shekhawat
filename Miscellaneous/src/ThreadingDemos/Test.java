package ThreadingDemos;


public class Test 
{
	private int n;
	private boolean flag;
	public synchronized void put(int n)
	{
		if(flag == true)
			try
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		this.n = n;
		System.out.println("PUT: " + n);
		flag = true;
		notify();
	}
	
	public synchronized int get()
	{
		if(flag == false)
			try
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		System.out.println("GOT: " + n);
		flag = false;
		notify();
		return n;
	}
}
