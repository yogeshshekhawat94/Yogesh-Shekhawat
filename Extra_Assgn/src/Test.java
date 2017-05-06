import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Test 
{
	public static void main(String[] args)
	{
	
	
		
		try {	
			
			File f = new File("Store.txt");
			
			Scanner sc = new Scanner(System.in);
			
			FileOutputStream fis = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream((fis));
			
			System.out.println("enter emp id");
			int id = sc.nextInt();

			System.out.println("enter emp name");
			String name = sc.next();

			System.out.println("enter emp sal");
			int sal = sc.nextInt();

			Employee e = new Employee(id, name, sal);

			dos.writeBytes(e.toString());
			dos.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
