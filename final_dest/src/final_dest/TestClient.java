package final_dest;

import java.util.Scanner;

public class TestClient extends Thread {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		cLang c = new cLang();
		Thread t1 = new Thread(c);
		
		JavaLang j = new JavaLang();
		Thread t2 = new Thread(j);
		
		System.out.println("enter sub u want to run first ");
		String a =sc.next();
		if(a.equalsIgnoreCase("JAVA") )
		{
			try {
				t2.join();
				t2.start();
				t1.start();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
			try 
			{
				t1.join();
				t1.start();
				t2.start();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
}
