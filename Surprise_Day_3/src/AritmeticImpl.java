
public class AritmeticImpl extends Arithmetic1 {

	@Override
	public int subtraction(int firstNo, int secondNo) {
		// TODO Auto-generated method stub
		int res = firstNo - secondNo;
		System.out.println("subtraction is : "+res);
		return res;
	}

	@Override
	public int subtraction(int firstNo, int secondNo, int thirdNo) {
		// TODO Auto-generated method stub
		int res = firstNo - secondNo - thirdNo;
		System.out.println("subtraction is : "+res);
		return res;
	}

	@Override
	public double subtraction(double firstNo, double secondNo) {
		// TODO Auto-generated method stub
		double res = firstNo - secondNo;
		System.out.println("subtraction is : "+res);
		return res;
	}

	@Override
	public double subtraction(int firstNo, double seconfNo) {
		// TODO Auto-generated method stub
		double res = seconfNo - firstNo ;
		System.out.println("subtraction is : "+res);
		return res;
	}

	@Override
	public float subtraction(float firstNo, float secondNo, float thirdNo) {
		// TODO Auto-generated method stub
		float res = firstNo - secondNo - thirdNo ;
		System.out.println("subtraction is : "+res);
		return res;
	}

	
}
