import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class FlashCardsData implements CardSearchable {

	FlashCard_1 f[] = new FlashCard_1[4];

	
	/*ArrayList<FlashCard_1> myCardsList  =  new ArrayList<FlashCard_1>();*/
	
	
	int flag = 0;
	FlashCard_1 fc ;
	
	@Override
	public Card serarchCard(String sub) throws CardNotFoundException {
		// TODO Auto-generated method stub
		
		for(int i=0;i<f.length;i++)
		{
			if (f[i].getSubject().equals(sub))
			{	
				flag = 1;
				//System.out.println(f[i]);
				fc=f[i];
			}			
		}

		if (flag==0)
		{
			throw new CardNotFoundException("The card you are looking for is not available”");
		}
		else
			return fc;
	}
	
	public void loadData()   {
		
		FileReader fr = null;
		
		try {
			
			 fr = new FileReader("cards_data.txt");
			 BufferedReader br = new BufferedReader(fr);
			 
			 String msg ;
			 while((msg=br.readLine()) != null)
			 {
				 StringTokenizer st = new StringTokenizer(msg,";");
				 while(st.hasMoreTokens())
				 {
					 String subject = st.nextToken();
					 
					 String question = st.nextToken();
					 
					 String answer = st.nextToken();
				 }
			 }
			
			int ch;
			while((ch = fr.read()) != -1)
			{
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		finally
		{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
		

}
