
public class Customer {

	private String custNo;
	private String custName;
	private String category;
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) throws InvalidInputException  
	{
		if (custNo.startsWith("c") || custNo.startsWith("C"))
		this.custNo = custNo;
		
		else
			throw new InvalidInputException("Invalid input");
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) throws InvalidInputException {
		
		if (custName.length() > 4)
		this.custName = custName;
		
		else
			throw new InvalidInputException("Invalid input");
		
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) throws InvalidInputException {
		
		if (category.equals("Platinum") || category.equals("Gold") || category.equals("Silver"))
		this.category = category;
		
		else
			throw new InvalidInputException("Invalid input");
	}
	
	public Customer(String custNo, String custName, String category) {
		
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
		
	}
	
	
	
	public Customer() {
		super();
	}
	
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName
				+ ", category=" + category + "]";
	}
	
	
}
