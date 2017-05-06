import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.CutAction;


public class TestCustomer {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Customer c1 = new Customer();
		
		try {
			System.out.println("enter cust no");
			 c1.setCustNo(s.next());
			
			System.out.println("enter cust name");
			c1.setCustName(s.next());
			
			System.out.println("enter cust category");
			c1.setCategory(s.next());
			
			System.out.println(c1);
			
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("invalid input");
			
		}
		
		
	
	}
}
