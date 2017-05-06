package geometry.shapes;

public class Line extends Point implements Shape {
	
	private Point point1;
	private Point point2;
	

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(" drawn  :"+getX()+" and "+getY());

	}

	@Override
	public void scale() {
		// TODO Auto-generated method stub
		System.out.println("scaled  :"+getX()+" and "+getY() );

	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	
	

}
