
public class Account implements AccountInter {

	private int accNo;
	private String name;
	private double  accBal;


	@Override
	public void create(int accNo, String name, double accBal) {
		// TODO Auto-generated method stub
		this.accNo = accNo;
		this.name = name;
		this.accBal = accBal;

	}

	@Override
	public double delete(int accNo) 
	{
		// TODO Auto-generated method stub
		//this.=null;
			return 0;
	}

	@Override
	public void print(int accNo) {
		// TODO Auto-generated method stub
		System.out.println("account no :"+accNo);
		System.out.println("name :"+name);
		System.out.println("acc balance :"+accBal);

	}

	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getAccBal() {
		return accBal;
	}


}
