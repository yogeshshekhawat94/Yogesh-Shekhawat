
public class Circle1 implements GeometryMethod, GeomtryConstant {

	@Override
	public double calArea(double radius) {
		// TODO Auto-generated method stub
		double res = PI * radius * radius ;
		System.out.println("Calculated area is :  "+res);
		return res;
	}

	@Override
	public double calCircumference(double radius) {
		// TODO Auto-generated method stub
		double res = 2 * PI * radius ;
		System.out.println("Calculated circumference is : "+ res);
		return res;
	}

}
