
import java.util.ArrayList;
public class Five{
	

	public static void main(String[] args) {
		
		
		ArrayList<Book> books=new ArrayList<Book>(100);
		
		for(int i=0;i<5;i++)
		{
			books.add(new Book(i,"A",347,3.5));
		}
		System.out.print(books);

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

