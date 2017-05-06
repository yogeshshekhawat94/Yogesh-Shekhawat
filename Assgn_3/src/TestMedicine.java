import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class TestMedicine 
{
	public static void main(String[] args) 
	{
		Medicine[] m=new Medicine[5];
		Random r=new Random();
		Scanner p = new Scanner(System.in); 
		
		
		for(int i=1;i<4;i++)
		{	
			int rn=r.nextInt(3)+1;
			
			if(rn==1)
			{	
				Date o = new Date();
				
				m[i] = new Tablet();
				Tablet a = (Tablet) m[i];
				
				System.out.println("enter price of medicine");
				a.setPrice(p.nextFloat());
				System.out.println("enter expiry date");
				o.setDate(p.nextInt());
				o.setDate((p.nextInt()) - 1);
				o.setDate((p.nextInt()) - 1900);
				a.setExpDt(o);
				a.getDetails();
				a.displayLabel();
			}
			if(rn==2)
			{
				Date o = new Date();
				
				m[i] = new Syrup();
				Syrup s = (Syrup) m[i];
				

				System.out.println("enter price of medicine");
				s.setPrice(p.nextFloat());
				System.out.println("enter expiry date");
				o.setDate(p.nextInt());
				o.setDate((p.nextInt()) - 1);
				o.setDate((p.nextInt()) - 1900);
				
				s.setExpDt(o);
				s.getDetails();
				s.displayLabel();
			}
			if(rn==3)
			{	
				Date o = new Date();
				
				m[i] = new Ointment();
				Ointment l = (Ointment) m[i];
				
				System.out.println("enter price of medicine");
				l.setPrice(p.nextFloat());
				System.out.println("enter expiry date");
				o.setDate(p.nextInt());
				o.setDate((p.nextInt()) - 1);
				o.setDate((p.nextInt()) - 1900);
				
				l.setExpDt(o);
				l.getDetails();
				l.displayLabel();
			}
		}
		
	}
}
