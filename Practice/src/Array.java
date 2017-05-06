import java.util.Scanner;


public class Array {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(" enter array elements");
		
		
		try {
			for (int i=0 ; i<10; i++)
			{
				a[i] = s.nextInt();
			}
			
			for ( int i = 0; i<11 ; i++)
			{
				System.out.println("array elements are "+a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("sorry, only 10 elements can be entered");
		}
		
	}
}
