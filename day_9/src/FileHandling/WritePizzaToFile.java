package FileHandling;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritePizzaToFile {

	public static void main(String[] args) {
		
		//1.create an object
		Pizza p = new Pizza("margarita",5);
		
		//2.write an obj into the file -FOS,DOS
		try {
			FileOutputStream fos = new FileOutputStream("pizz.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			//dos.writeBytes(p.toString());
			dos.writeChars(p.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
