package linkedlist;
import java.util.LinkedList;

public class Second {
	public static void main(String[]args) {
	
	LinkedList<Time>times=new LinkedList<Time>();
	
	for(int i=0;i<100000;i++)
	{
		times.add(new Time(i,"A",34.67,3.5));
	}
	
	long start_time=System.nanoTime();
	System.out.println(times.get(99000));
	long end_time=System.nanoTime();
	System.out.println("time taken:"+(end_time-start_time)/1000);;
	
	}
}


class Time
{
	int id; //access modifier default
	String name;
	double price;
	double ratings;
	
	public Time(int id,String name,double price,double ratings)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.ratings=ratings;
	}
}