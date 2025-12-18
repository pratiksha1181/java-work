package collection;

import java.util.HashSet;

public class Setfirst {
	public static void main (String[]args) {
	
	
	HashSet<Book> set=new HashSet<Book>();
     
//	set.add(12);
//	set.add(23); //not allow duplicate values
//	set.add(23);
//	set.add(12);
//	set.add(null);
//	System.out.println(set);
	
	Book b1=new Book(1,256.44);
	Book b2=new Book(2,342.67);
	Book b3=new Book(3,236.64);
	Book b4=new Book(1,256.44);
	
	set.add(b1);
	set.add(b2);
	set.add(b3);
	set.add(b4);
	
	System.out.print("b1:"+b1.hashCode());
	System.out.print("b4:"+b4.hashCode());
	System.out.print(b1.equals(b4));
//	System.out.print(set);
	}
}

class Book
{
	int id;
	double price;
	public Book(int id, double price)
	{
		this.id=id;
		this.price=price;
	}
	public String toString()
	{
	  return "{"+this.id+" "+this.price+"}";
	}
	public int hashcode()
	{
		return this.id+(int)this.price;
	}
	public boolean equals(Object obj)
	{
		Book b=(Book)obj;
		return this.id==b.id && this.price==b.price;
		
	}
}