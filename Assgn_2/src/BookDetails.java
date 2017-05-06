import java.util.Scanner;


public class BookDetails {

	public static void main(String[] args) {
		
		//Book_1 b1=new Book_1();
		Book_1[] q= new Book_1[3];
		
		Scanner s= new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			
			q[i]=new Book_1();
		
		System.out.println("enter bookNo");
		int a=s.nextInt();
		q[i].setBookNo(a);
		
		System.out.println("enter book title");
		String b=s1.nextLine();	q[i].setTitle(b);
		
		System.out.println("enter author");
		String c=s1.nextLine();q[i].setAuthor(c);
		
		System.out.println("enter price");
		float f=s.nextFloat();
		q[i].setPrice(f);
	
		}	
		for(int i=0;i<3;i++)
		{
			System.out.println(q[i]);
		}
		System.out.println(Book_1.getBookCnt());
	}
}
