

public class Professor {

	private String name;
	private Student student;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	void teaches(Course course)
	{
		System.out.println(name+" is teaching "+course.getName()+" to "+student.getName());
	}
	
	void conductingExam(Exam exam)
	{
		System.out.println(name+" is conducting "+exam.getName()+" exam paper ");
		
	}
	
	int evaluatingPaper(Exam exam)
	{
		System.out.println(name+" is evaluating "+exam.getName());
		return 1;
		
	}
	@Override
	public String toString() {
		return "Professor [name=" + name + ", student=" + student + "]";
	}
	
	
}
