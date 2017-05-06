package ThreadingDemos;


public class Producer extends Thread 
{
	Test test;//0,false
	public Producer(Test test) 
	{
		this.test = test;//0,false
		start();
	}
	@Override
	public void run()
	{
		int i = 0;
		while(i<=10)
		{
			test.put(i++);
		}
	}
}
