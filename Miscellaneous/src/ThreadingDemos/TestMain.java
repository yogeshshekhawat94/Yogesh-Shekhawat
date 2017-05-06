package ThreadingDemos;

public class TestMain 
{
	public static void main(String[] args)
	{
		Test test = new Test();//0,false
		new Producer(test);
		new Consumer(test);
	}

}
