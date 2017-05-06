import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class CopyFile {

	public static void main(String[] args) {

		File f1 = new File(args[0]);
		try {
			f1.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		File f2 = new File(args[1]);
		Scanner s = new Scanner(System.in);

		try {
			FileInputStream fis = new FileInputStream(f1);
			FileOutputStream fos = new FileOutputStream(f2);
			FileOutputStream fos1 = new FileOutputStream(f1);
			
			String s1="OOOOKKKKKKK";
			byte b[]=s1.getBytes();
			fos1.write(b);
			
			if (f1.exists() )
			{
				if(f2.exists())
				{
					System.out.println("Want to Overwrite?  say Y/N");
					if(s.next().equalsIgnoreCase("Y"))
					{
						int ch;
						while((ch = fis.read())!= -1)
						{
							fos.write((char)ch);
						}
					}
					else
						System.out.println("ok");
				}
				else
				{
					f2.createNewFile();
					System.out.println("file is created");
				}
				
			}

			else
			{
				System.out.println("file does not exist");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
