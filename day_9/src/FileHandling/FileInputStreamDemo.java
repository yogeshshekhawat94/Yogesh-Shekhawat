package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		File f = new File("D:\\501654\\DAY_2\\src\\Associate.java");

		try{

			FileInputStream fis = new FileInputStream(f); 

			int ch;
			while ((ch = fis.read()) != -1)
			{
				System.out.print((char)ch);
			}
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}

	}
}
