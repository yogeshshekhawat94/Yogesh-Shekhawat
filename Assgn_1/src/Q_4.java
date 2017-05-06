
public class Q_4 
	{
		public static void main(String a[])
		{
			int n =Integer.parseInt(a[0]);
			int i=0;
			int arr[]=new int[5];
			
			arr[0]=1;arr[1]=11;arr[2]=6;arr[3]=12;arr[4]=19;
			
			for (i=0; i < arr.length ; i++)
			{
				if(n == arr[i])
				{
					System.out.println("BINGO");
				}
			}
				
		}
			
		

}
