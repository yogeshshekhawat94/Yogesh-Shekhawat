package ravina;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class U_l_case
{
		public static void main(String[] args) 
		{
			try
			{
				File f1= new File("source.txt");
				f1.createNewFile();
				File f2= new File("dest.txt");		
				
				FileReader fr=new FileReader(f1);
				BufferedReader br=new BufferedReader(fr);
				FileWriter fw=new FileWriter(f2);
				
				
				String s;
				while((s=br.readLine())!=null)
				{
					String s1=s.toUpperCase();
					fw.write(s1);
					fw.write("\n");
				}		
				
				fr.close();
				fw.close();
				
				
			}
			catch (FileNotFoundException e) 
			{
					e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		}
	
}
