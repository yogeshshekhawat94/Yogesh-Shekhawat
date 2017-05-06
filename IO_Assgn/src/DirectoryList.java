import java.io.File;
import java.util.Scanner;


public class DirectoryList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter directory name");
		String dname = sc.next();
		
		File f = new File(dname);
		
		if(f.isDirectory())
		{
			String s[] = f.list();
			for (int i=0;i< s.length; i++) 
			{
				System.out.println(s[i]);
			}
		}
		
		else
			System.out.println("Directory does not exist");
		
	}
}