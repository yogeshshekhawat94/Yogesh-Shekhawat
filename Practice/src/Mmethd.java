import java.util.Scanner;


public class Mmethd {

	public static void main(String[] args) {
		
		ExceptionMethod e = new ExceptionMethod();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(" entter first no");
		e.setNum1(s.nextInt());
		
		System.out.println("enter second no");
		e.setNum2(s.nextInt());
		
		try {
			
			e.division();
			
		} catch (ArithmeticException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.out.println(" denom cannot be zero");
		}
	}
}
