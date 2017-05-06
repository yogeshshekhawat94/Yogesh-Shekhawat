package ThreadingDemos;

public class Consumer extends Thread 
{
	Test test;
	public Consumer(Test test) 
	{
		this.test = test;
		start();
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			test.get();
		}
	}
}
