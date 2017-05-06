
public class Employee {

	private int empNo;
	private String empName;
	private int empBasic;
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpBasic(int empBasic) {
		this.empBasic = empBasic;
	}
	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName
				+ ", empBasic=" + empBasic + "]";
	}
	
	
	
}
