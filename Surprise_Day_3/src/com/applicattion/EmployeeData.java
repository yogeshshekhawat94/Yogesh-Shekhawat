package com.applicattion;

import java.util.Scanner;

import com.techm.Employee;



public class EmployeeData {

	public static void main(String[] args) {
		
		com.techm.Employee e1 = new Employee(6231, "Vijay", 30000);
		System.out.println(e1);
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter amp no");
		int a = s.nextInt();
		System.out.println("enter employee name");
		String r = s.next();
		System.out.println("enter emp sal");
		int m = s.nextInt();
		
		Employee e2 = new Employee(a,r,m);
		System.out.println(e2);
		
	}
}
