package esg.itp.shapes;

public class Square implements Polygon {

	double side;
	
	
	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		double area = side * side;
		System.out.println(area);

	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		double peri = 4 * side; 
		System.out.println(peri);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("area of square is :");
	}

}
