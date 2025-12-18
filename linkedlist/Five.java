package linkedlist;
import java.util.ArrayList;
public class Five{
	public static void main(String[]args) {
	
	ArrayList<Book>books=new ArrayList<Book>();
	
	for(int i=0;i<100000;i++)
	{
		books.add(new Book(i,"A",34.67,3.5));
	}
	
	long start_time=System.nanoTime();
	System.out.println(books.get(99000));
	long end_time=System.nanoTime();
	System.out.println("time taken:"+ start_time );
	
	}
}


class Book
{
	int id; //access modifier default
	String name;
	double price;
	double ratings;
	
	public Book(int id,String name,double price,double ratings)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.ratings=ratings;
	}
}


