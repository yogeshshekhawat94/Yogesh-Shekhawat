import java.util.ArrayList;
import java.util.Scanner;


public class Thread1 extends Thread
{
	@Override
	public void run()
	{		
		ArrayList<Item> a = new ArrayList<Item>();
		Item i1[] = new Item[5];
		Scanner sc = new Scanner(System.in);
		
		for (int j = 0; j <5; j++) 
		{
			System.out.println("enter item id ");
			int id = sc.nextInt();
			System.out.println("enter item name ");
			String iname = sc.next();
			
			i1[j] = new Item(id, iname);
			a.add(i1[j]);
			
		}
	}
		
}
