import java.util.Scanner;


public class TestCircle {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Circle1 c = new Circle1();
		
		System.out.println(" Enter the radius of circle");
		double a = s.nextDouble();
		
		c.calArea(a);
		c.calCircumference(a);
		
		
	}
}
