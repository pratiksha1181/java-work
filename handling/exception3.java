package handling;

import java.util.Objects;

public class exception3 {
	public static void main(String[] args) {
		
//	phone phone=new phone();
//	phone.id=12;
//	phone phone2=new phone();
//		phone.id=24;
//		System.out.println(phone.hashcode());
//	System.out.println(phone2.hashCode());
		
        phone phone=new phone();
		phone.id=12;
		phone.model="smart";
		phone.price=70.90;
				
	    phone phone2=new phone();
		phone2.id=12;
		phone2.model="smart";
		phone2.price=71.90;		
		System.out.println(phone.hashCode());
		System.out.println(phone2.hashCode());
		
	}

}
class phone
{
	int id;
	String model;
	double price;
	
	public int hashCode()
		{
		
		return Objects.hash(id,model,price);	
		}
	}
	

