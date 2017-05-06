package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("A");
		a.add(true);
		a.add("Good");
		a.add(40.83);
		a.add(new Emp(1));
		System.out.println(a);
		
		//1
		//System.out.println(a);
		
		/*
		//2
		for(int i = 0 ; i < a.size() ; i++)
		{
			System.out.println(a.get(i));
		}
	
		//3
		Iterator i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		
		
	}
	
}
