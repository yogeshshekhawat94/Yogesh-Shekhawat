import java.io.File;
import java.util.Scanner;


public class FlashCardTest {

	public static void main(String[] args) {

		FlashCardsData fcd = new FlashCardsData();
		
		/*File f2 = new File("cards_data.txt");*/
	
		/*Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("enter sub u want to search");
		String sub = sc.next();
		try {
			System.out.println(fcd.serarchCard(sub));
		} catch (CardNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("The card you are looking for is not available");
		}*/
			
		fcd.loadData();
		
	}
	

}
