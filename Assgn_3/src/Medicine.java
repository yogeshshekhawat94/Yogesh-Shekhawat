import java.util.Date;


public abstract class Medicine 
{
	float price;
	Date ExpDt;
	
	public void getDetails() 
	{
		System.out.println("price of medicine : "+price);
		System.out.println("expiry date of medicine :"+ExpDt);
				
	}
	
	
	
	public void setPrice(float price) {
		this.price = price;
	}



	public void setExpDt(Date expDt) {
		ExpDt = expDt;
	}



	public abstract void displayLabel();
		
}
