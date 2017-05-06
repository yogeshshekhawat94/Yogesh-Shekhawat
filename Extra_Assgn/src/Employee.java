
public class Employee {

	private  int empId;
	private int empSalary;
	private  String  empName;

	public Employee(int empId, String empName,int empSalary) {
		super();
		this.empId = empId;
		this.empSalary = empSalary;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "empId is =    " + empId + " \n empSalary=   " + empSalary
				+ ",\n empName is=  " + empName + "";
	}

	@Override
	public boolean equals(Object obj)
	{
		Employee e=(Employee) obj;
		if(e.empName.equalsIgnoreCase(empName))
		{
			if(e.empId == empId)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}




}
