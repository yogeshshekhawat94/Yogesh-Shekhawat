import java.util.ArrayList;
import java.util.Scanner;


public class Item extends Thread 
{

	private int itemId;
	private String itemName;

	public Item(int itemId, String itemName)
	{
		super();
		this.itemId = itemId;
		this.itemName = itemName;
	}

	public Item()
	{
		super();
	}

	@Override
	public String toString() 
	{
		return "Item [itemId=" + itemId + ", itemName=" + itemName + "]";
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
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

	public static void main(String[] args) 
	{

		Thread t1 = new Thread();

		Thread t2 = new Thread();

		t1.start();
		t2.start();


	}
}
