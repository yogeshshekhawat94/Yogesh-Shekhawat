package CollectionDemo;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(9,"Sarvesh" );
		hm.put(2007, "Shashank");
		hm.put(2013, "Guru");
		hm.put(2015, "Shefu");
		
		//System.out.println(hm);
		
		/*for(int i = 0 ; i < hm.size() ; i++)
		{
			
			
			
		}*/
		/*Enumeration e= (Enumeration) hm.entrySet();
		while(e.hasMoreElements())
		{
			Map.Entry me=(Map.Entry) e.nextElement();
			System.out.println(me.getKey()+"    "+me.getValue());
		}*/
		
		Iterator i=  hm.entrySet().iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry) i.next();
			System.out.println(me.getKey()+"    "+me.getValue());
		}
		
		
		
		/*Enumeration e = (Enumeration) hm.entrySet();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		*/
		
	}
}
