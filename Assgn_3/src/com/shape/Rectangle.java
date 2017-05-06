package com.shape;

public class Rectangle implements Polygon 
{
	float length;
	float breadth;
	
	@Override
	public void calcArea() 
	{
		// TODO Auto-generated method stub
		float area = length * breadth;
		System.out.println(" Area of rectangle is :" +area);
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		float peri = 2 * (length + breadth) ;
		System.out.println("Perimeter of rectangle is :" +peri);
	}

	public void setLength(float length) {
		this.length = length;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	

}
