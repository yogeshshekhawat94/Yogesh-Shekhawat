import java.util.Scanner;

public class BookDetails {

public static void main(String[] args) {
		
		int flag=0;
		//Book_1 b1=new Book_1();
		Book_1[] q= new Book_1[3];
		
		Scanner s= new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			
			q[i]=new Book_1();
		
		System.out.println("enter bookNo");
		int a=s.nextInt();
		System.out.println("enter book title");
		String b=s1.nextLine();
		System.out.println("enter author");
		String c=s1.nextLine();
		System.out.println("enter price");
		float f=s.nextFloat();
		
	
		q[i].setBookNo(a);
		q[i].setTitle(b);
		q[i].setAuthor(c);
		q[i].setPrice(f);
	
		}	
		for(int i=0;i<3;i++)
		{
			System.out.println(q[i]);
		}
		
		System.out.println(Book_1.getBookCnt());
		
		System.out.println("enter booNo");
		
		int Bno=s.nextInt();
		for(int i=0;i<3;i++)
		{
			if (q[i].getBookNo()==Bno)
			{
				flag=1;
				System.out.println(q[i]);
			}
			
		}
		if(flag==0)
		{
			System.out.println("BookNo not found");
		}
		
		
	}
}

