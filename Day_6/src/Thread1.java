
public class Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("great Ron.....");

	}

	public static void main(String[] args) {
		Runnable t = new Thread1();
		Thread t1 = new Thread(t);
		t1.start();
	}

}
