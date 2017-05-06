
public class Q_2 
{
	public static void main(String a[])
		{
			int n1=Integer.parseInt(a[0]);
			int n2=Integer.parseInt(a[1]);
			int n3=Integer.parseInt(a[2]);
			int i=0;
			int sum=0;
			float avg=0f;
			sum= n1+n2+n3;
			avg= sum/a.length;
			System.out.println("sum is "+sum);
			System.out.println("avg is "+avg);
			
			for(i=0 ;i < a.length ;i++)
			{
				if (Integer.parseInt(a[i]) <= avg) 
				{		
					System.out.println("no less than avg is "+a[i]);
					
				}
			}
		}
}
