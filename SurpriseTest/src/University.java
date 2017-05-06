
import java.util.Scanner;


public class University {

	static int count;
	private static Professor professor;
	Exam exam;
	static Course course;
	
		
	public static void setProfessor(Professor professor) {
		University.professor = professor;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public static void setCourse(Course course) {
		University.course = course;
	}

	Boolean studentVerificationProcess(Student student)
	{
		if(Validator.validateStudent(student))
		{
		System.out.println(student+"you are registered successfully..welcome to our university");
		return true;
		}
		else
			return false;
	}
	
	void writeExamGetResult(Exam exam)
	{
		if (professor.evaluatingPaper(exam) == 1) 
		{
			System.out.println("marks ------>"+exam.getMarks());
			System.out.println( Student.class.getName()+"your % is 80 and above ");
		}
	}
	
	void studentAdmission(Student student, Course course)
	{
		System.out.println("your stud id ="+course.getId());
		System.out.println(student.getName()+" registered for "+course);
	}
	
	void studentCertificationProcess(Student student, Course course)
	{
		System.out.println("student"+student+" applied for university");
		System.out.println(student+" applied for " +course);
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Student s1 = new Student();
		
		System.out.println("enter student name");
		s1.setName(s.next());
		
		System.out.println("Enter student age");
		s1.setAge(s.nextInt());
		
		System.out.println("enter student marks");
		s1.setPreviousMarks(s.nextInt());
		
		System.out.println("enter course id");
		int a = s.nextInt();
		
		System.out.println("enter course name");
		String b = s.next();
		
		System.out.println("enter course duration");
		int c = s.nextInt();
		
		Course c1 = new Course(a, b, c);
		
		System.out.println("enter professor name");
		String p = s.next();
		
		Professor p1 = new Professor();
		
		p1.setName(p);
		
		p1.setStudent(s1);
		
		Exam e = new Exam();
		
		e.setMarks(90);
		
		e.setName(c1.getName());
		
		University u = new University();
		u.setExam(e);
		u.setCourse(c1);
		u.setProfessor(p1);
		
		/*u.course.setName(b);
		u.professor.setName(p);
		u.exam.setName(b);
		*/
		u.studentCertificationProcess(s1, c1);
		
		u.studentVerificationProcess(s1);
		
		u.studentAdmission(s1, c1);
		
		u.professor.teaches(c1);
		
		u.writeExamGetResult(e);
		
		u.professor.conductingExam(e);
		
		u.professor.evaluatingPaper(e);
		
			
	}
}

