package final_dest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestFile {


	public static void main(String[] args) {

		FileOutputStream fos = null;
		DataOutputStream dos=null;
		FileInputStream fis = null;
		DataInputStream dis =null;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter no of employees");
		int j = sc.nextInt();

		Employee e[] = new Employee[j] ;

		File f = new File("empdetails.txt");

		try {

			fos = new FileOutputStream(f);
			dos = new DataOutputStream(fos);

			fis = new FileInputStream(f);
			dis = new DataInputStream(fis);


			for (int i = 0; i<j; i++)
			{
				e[i] = new Employee();

				System.out.println("enter emp id");
				e[i].setEmpId(sc.nextInt());
				System.out.println("enter emp name");
				e[i].setEmpName(sc.next());
				System.out.println("enter emp grade");
				e[i].setGrade(sc.next());

				//	dos.writeByte(e[i]);
				dos.writeBytes(e[i].toString());
			}

			String msg;
			while((msg = dis.readLine()) != null)
			{
				System.out.println(msg);
			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		} catch (InvalidGradeException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		}

		finally
		{

			try {
				dos.close();
				fis.close();
				dis.close();
				fos.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}



	}
}
