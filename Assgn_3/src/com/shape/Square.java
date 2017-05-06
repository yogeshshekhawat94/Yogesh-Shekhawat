package com.shape;

public class Square implements Polygon 
{
	float side;
	
	
	@Override
	public void calcArea() 
	{
		// TODO Auto-generated method stub
		float area = side * side;
		System.out.println("Area of square is :"+area);

	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		float peri = 4 * side;
		System.out.println(" Perimeter of square is :"+peri);
	}

	public void setSide(float side) {
		this.side = side;
	}

	
}
