
public class Validator {

	public static boolean validateStudent(Student s) 
	{
		if(Registrar.registerStudent(s))
		{	
		System.out.println("validator validating "+s+"please wait....");
		return true;
		}
		
		else 
			return false;
				
		}
}
