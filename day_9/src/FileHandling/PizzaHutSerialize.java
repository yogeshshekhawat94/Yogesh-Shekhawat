package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PizzaHutSerialize {

	public static void main(String[] args) {
		
		//1.create an object
		Pizza p = new Pizza("Delux Margarita ", 5);

			//2.Serialization- FOS,OOS
		try {
			FileOutputStream fos = new FileOutputStream("pizzainfo.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(p);
			fos.close();
			oos.close();

			//3.Deserialization - FIS, OIS

			FileInputStream fis = new FileInputStream("pizzainfo.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//4.close 
			Pizza p1 = (Pizza) ois.readObject();
			System.out.println(p1);
			fis.close();
			ois.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
