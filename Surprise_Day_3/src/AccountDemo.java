import java.util.Scanner;


public class AccountDemo {

	public static void main(String[] args) {
		
		Account account[] = new Account[5];
		
		Scanner s  = new Scanner(System.in);
		
		for(int i = 0 ; i<3 ; i++)
		{
			account[i]= new Account(); 
			System.out.println(" Enter accountNo ");
			int a = s.nextInt();
			System.out.println("Enter name ");
			String x = s.next();
			System.out.println(" Enter accBal");
			double d = s.nextDouble();
			
			
			account[i].create(a, x, d);
			
		}
		
		System.out.println(" Enter account no u want to display");
		int g = s.nextInt();
		
		for(int i = 0 ; i<3 ; i++)
		{
			if(account[i].getAccNo() == g)
			{
				account[i].print(g);
			}
		}
		System.out.println("enter account u want to delete");
		int o = s.nextInt();
		
		for(int i = 0; i<3; i++)
		{
			if (account[i].getAccNo() == o)
			{
				//double d=account[i].delete(o);
				//account[i] = account[account.length - 1];
				
			}
		}
	}
}
