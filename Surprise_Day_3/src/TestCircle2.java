import java.util.Scanner;


public class TestCircle2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Circle2 c = new Circle2();

		System.out.println(" Enter the radius of circle");
		double a = s.nextDouble();

		c.calArea(a);
		c.calCircumference(a);
	}
}
