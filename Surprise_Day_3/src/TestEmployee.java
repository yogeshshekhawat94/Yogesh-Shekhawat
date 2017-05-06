import java.util.Scanner;


public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(" enter employee no :");
		e.setEmpNo(s.nextInt());
		
		System.out.println("enter employee name :");
		e.setEmpName(s.next());
		
		System.out.println(" enter employee basic :");
		e.setEmpBasic(s.nextInt());
		
		System.out.println(e);
		
	}
}
