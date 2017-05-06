
public class Student {

	private int age;
	private String name;
	private int previousMarks;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPreviousMarks() {
		return previousMarks;
	}
	public void setPreviousMarks(int previousMarks) {
		this.previousMarks = previousMarks;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", previousMarks="
				+ previousMarks + "]";
	}
	
	
}
