package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		File f = new File("D:\\501654\\DAY_2\\src\\Associate.java");
		
		
		if (f.exists())
			System.out.println("File exists");
		else
			try {
				
				if(f.createNewFile())
					System.out.println("File is created");
				else
					System.out.println("some error.........");
			} 
				catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
