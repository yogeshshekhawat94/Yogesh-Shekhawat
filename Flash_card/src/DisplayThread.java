import java.util.Scanner;


public class DisplayThread extends Thread {

	static FlashCardsData fcd;
	
	public static void main(String[] args) {
		
		fcd = new FlashCardsData();
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) 
		{
			fcd.f[i] = new FlashCard_1();
			
			System.out.println("enter subj");
			fcd.f[i].setSubject(sc.nextLine());
			
			System.out.println("enter question");
			fcd.f[i].setQuestion(sc.nextLine());
			
			System.out.println("enter answer");
			fcd.f[i].setAnswer(sc.nextLine());
		}
		
		DisplayThread dt = new DisplayThread();
		dt.start();
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 4; i++) {
			
			System.out.println(fcd.f[i]);
			try {
				sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			super.run();
			
		}
		
		
	}
	
}
