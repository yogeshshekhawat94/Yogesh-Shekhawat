package Application;

import java.util.Scanner;

import TechM.Employee;

public class EmployeeData {

	public static void main(String[] args) {
		
		Employee e = new Employee(123, "Manjiri", 25000);
		
		System.out.println(e);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(" enter empno :");
		e.setEmpNo(s.nextInt());
		
		System.out.println(" enter emp name");
		e.setEmpName(s.next());

		System.out.println(" enter emp salary");
		e.setEmpSal(s.nextInt());
		
		System.out.println(e);
	}
}
