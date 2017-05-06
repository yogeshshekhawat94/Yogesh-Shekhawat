import java.util.Scanner;


public class EmpTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Employee e = new Employee();
		Employee e1 = new Employee();
		
		System.out.println("enter name of empl");
		e.setEmp_name(s.next());
		e1.setEmp_name(s.next());
		
		if(e.equals(e1))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
		e.hashCode();
		e1.hashCode();
		
		if(e == e1)
		{
			System.out.println("hashcode is equal");
		}
		else
		{
			System.out.println("hashcode not equal");
		}
	}
	
}
