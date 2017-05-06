
public class Q_1 
{
	public static void main(String a[])
	{
		int n=Integer.parseInt(a[0]);
		
		int i=0;
		int k=0;
		
		for (i=0; i <= n ;i++ )
		{
			k= i % 2; 
			if (k == 0)
			{ 
				System.out.println(" even number is "+i );
			}
			
		}
		
	}
	

}
