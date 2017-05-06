package com.test;
import java.util.Scanner;

import com.shape.*;

public class Test
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		Square sq = new Square();
		Rectangle r = new Rectangle();
		
		System.out.println("enter side of square");
		sq.setSide(s.nextFloat());
		
		System.out.println("enter length of rectangle");
		r.setLength(s.nextFloat());
		System.out.println("enter breadth of rectangle");
		r.setBreadth(s.nextFloat());
		
		sq.calcArea();
		sq.calcPeri();
		r.calcArea();
		r.calcPeri();
	}
	
}
