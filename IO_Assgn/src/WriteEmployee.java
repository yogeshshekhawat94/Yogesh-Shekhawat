import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class WriteEmployee {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter emp no");
			int eNo = sc.nextInt();

			System.out.println("Enter emp name");
			String eName = sc.next();
			byte b[] = eName.getBytes();

			System.out.println("enter emp basic");
			int eBasic = sc.nextInt();

			Employee e = new Employee(eNo, eName, eBasic);

			//System.out.print(e);

			File f = new File("emp.txt");
			
			//1.Serialization
			FileOutputStream fos = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeBytes(e.toString());
			/*dos.write(eNo);
			dos.writeBytes(eName);
			dos.write(eBasic);*/
			
			//2.de-serialization
			FileInputStream fis = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fis);
			
			int ch;
			while((ch=dis.read())!= -1)
			{
				System.out.print((char)ch);
			}
			
			fos.close();
			dos.close();
			fis.close();
			dis.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}