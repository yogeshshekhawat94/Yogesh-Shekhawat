
public class TestRav
{
	
	@Override
	public String toString() {
		return "TestRav [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) 
	{
		/*String s1=new String("Ravi");
		String s2=new String("Pari");
		String s3="Pari";
		String s4="Ravi";*/
		Integer s1=new Integer(20);
		
		Integer s2=new Integer(10);
		int s3=20;
		int s4=20;
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		//System.out.println(s3.hashCode());
		//System.out.println(s4.hashCode());
		
		if(s1==s2)
			System.out.println("s1 & s2Equal");
		else
			System.out.println("s1 & s2Not Equal");
		
		/*if(s3==s4)
			System.out.println("s3 & s4Equal");
		else
			System.out.println("s3 & s4Not Equal");*/
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
