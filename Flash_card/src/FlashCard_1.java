
public class FlashCard_1 extends Card
{
	private String subject;
	private String question;
	private String answer;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	@Override
	public String toString() {
		return "FlashCard [subject=" + subject + ", question=" + question
				+ ", answer=" + answer + "]";
	}
	
	public FlashCard_1(String subject, String question, String answer) {
		super();
		this.subject = subject;
		this.question = question;
		this.answer = answer;
	}
	
	public FlashCard_1() {
		// TODO Auto-generated constructor stub
	}
	public void displayCard()
	{
		System.out.println("subject is : "+this.subject);
		System.out.println("question is :"+this.question);
		System.out.println("answer is :"+this.answer);
	}
	
}
