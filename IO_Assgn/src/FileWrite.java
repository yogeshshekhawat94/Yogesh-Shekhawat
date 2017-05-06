import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class FileWrite {

	public static void main(String[] args) {

		try {
			Scanner s = new Scanner(System.in);

			System.out.println("Enter 3 lines");

			String s1[] = new String[3];

			File f = new File("letter.txt");

			FileOutputStream fos = new FileOutputStream(f);

			char ch1 = '\n';
			int c = ch1;

			for ( int i=0; i<3 ; i++)
			{
				s1[i]= s.nextLine();
				byte b[] = s1[i].getBytes();

				fos.write(c);
				fos.write(b);

			}

			System.out.println("size of file is : "+f.getTotalSpace());
			System.out.println("size of file :"+f.getUsableSpace());
			System.out.println("Contents of file is");

			FileInputStream fis = new FileInputStream(f);

			int ch;
			while((ch=fis.read()) != -1)
			{
				System.out.print((char)ch);
			}

			fos.close();
			fis.close();
			f.delete();
			System.out.println("File is deleted");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}