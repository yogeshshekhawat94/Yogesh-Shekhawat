package final_dest;

import java.io.Serializable;

public class Employee implements Serializable{

	private int empId;
	private String empName;
	private String grade;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) throws InvalidGradeException {
		if (grade.startsWith("U"))
		{
		this.grade = grade;
		
		}
		else
		{
			throw new InvalidGradeException("invalid id");
		}
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", grade="
				+ grade + "]";
	}
	
	
	
	
}
