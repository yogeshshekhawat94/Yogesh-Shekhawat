package ravina;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Arguments 
{
		public static void main(String[] args) 
		{
				if(args.length==5)
				{
						String n[]=new String[5];
						for(int i=0;i<5;i++)
						{
								n[i]=args[i];
						}
						File f=new File("NumberFile.txt");
						
						try
						{
							FileOutputStream fos=new FileOutputStream(f,true);
							DataOutputStream dos=new DataOutputStream(fos);
							if(f.exists())
							{
								
								for(int i=0;i<5;i++)
								{
										//fos.write(n[i]);
									//dos.writeInt(n[i]);
									dos.writeBytes(n[i]);
									dos.writeBytes("\n");
										//System.out.println(n[i]);
								}
								fos.close();
								dos.close();
							}
							else
							{
								f.createNewFile();
								for(int i=0;i<5;i++)
								{
									dos.writeBytes(n[i]);
								}
								dos.close();
								fos.close();
							}
							
							FileInputStream fis=new FileInputStream(f);
							int ch;
							while((ch=fis.read())!=-1)
							{
								System.out.println(ch);
							}
							
							fis.close();
							
							
						} 
						catch (FileNotFoundException e)
						{
							e.printStackTrace();
						} 
						catch (IOException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}						
				}
				else
				{
						try 
						{
							throw new InvalidInputException("You should enter 5 arguments.....");
						} 
						catch (InvalidInputException e)
						{
							System.out.println(e.getMessage());
						}
				}
				
		}
}
