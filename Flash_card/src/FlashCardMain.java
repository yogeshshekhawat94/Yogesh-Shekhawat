import java.util.Scanner;


public class FlashCardMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FlashCard f[] = new FlashCard[4]; 
		
		for (int i = 0; i < 2; i++)
		{
			f[i] = new FlashCard();
			System.out.println("enter subject");
			f[i].setSubject(sc.next());
			
			System.out.println("enter your question");
			f[i].setQuestion(sc.next());
			
			System.out.println("enter answer for question");
			f[i].setAnswer(sc.next());		
			
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println(f[i]);
		}

	}
}
