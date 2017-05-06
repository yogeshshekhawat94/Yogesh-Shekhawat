import java.io.File;
import java.util.Scanner;



public class FlashCardTest_1 extends Thread {

	public static void main(String[] args) {

		FlashCardsdata_1 fcd = new FlashCardsdata_1();
		
		fcd.loadData();

		//File f2 = new File("cards_data.txt");

		Scanner sc = new Scanner(System.in);

		/*for (int i = 0; i < 4; i++) 
		{
			fcd.f[i] = new FlashCard_1();

			FlashCard_1 fs = new FlashCard_1();

			System.out.println("enter subj");
			fs.setSubject(sc.next());

			System.out.println("enter question");
			fs.setQuestion(sc.nextLine());

			System.out.println("enter answer");
			fs.setAnswer(sc.nextLine());

			fcd.myCardsList.add(fs);
		}
*/
		System.out.println("enter sub u want to search");
		String sub = sc.next();
		try {
			System.out.println(fcd.serarchCard(sub).getQuestion());
			sleep(5000);
			System.out.println(fcd.serarchCard(sub).getAnswer());
			
		} catch (CardNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("The card you are looking for is not available");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
