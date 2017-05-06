
public class MyThread extends Thread {

	public MyThread() {

		setName("t1");
		start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Hello.........");
	}

	public static void main(String[] args) {

		new MyThread();
		
		
	}

}
