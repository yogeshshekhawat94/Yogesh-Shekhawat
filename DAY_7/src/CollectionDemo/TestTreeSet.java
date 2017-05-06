package CollectionDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet 
{

	public static void main(String[] args) {

		TreeSet<String> Product = new TreeSet<String>();
		Product.add("iphone");
		Product.add("ipod");
		Product.add("ipod");
		Product.add("dslr");

		Iterator i = Product.iterator();

		while (i.hasNext()) 
		{
			System.out.println(i.next());
			
		}
		
		System.out.println("first element is : "+Product.first());
		System.out.println("last name is : "+Product.last());
		System.out.println("size is : "+Product.size());
		
		Product.remove("dslr");
		System.out.println(Product);
		
		System.out.println("size after removing is : "+Product.size());
		
		
	}
}
