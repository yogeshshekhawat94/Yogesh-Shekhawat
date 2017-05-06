
public class Book_1 {

	private int bookNo;
	private String title;
	private String author;
	private float price;
	private static int bookCnt; 
	public int flag=0;

	static
	{
		bookCnt=0;
	}

	public static int getBookCnt()
	{
		return bookCnt;
	}

	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {

		if (title.length() < 4)
		{	
			flag=1;
			System.out.println("title name not valid");
			System.exit(1);
			//this.title = title;
		}
		else
			this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if (price>=1&&price<=5000)
		{
			flag=1;
			System.out.println("price cannot be less than 1 and greater than 5000");
			//this.price = price;
		}
		else
			this.price = price;
	}


	public Book_1() {

		bookCnt++;
	}


	public Book_1(int bookNo, String title, String author, float price) {
		super();
		if (title.length() < 4)
		{
			System.out.println("title name not valid");
		}
		if (price<1 || price>5000)
		{
			System.out.println("price cannot be less than 1 and greater than 5000");
		}
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;

		bookCnt++;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "book no: "+this.bookNo+"\n book author :"+this.author+"\n book title:"+this.title+"\n book price :"+this.price;

	}



}
