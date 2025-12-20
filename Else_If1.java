package Practice;

public class Else_If1 {

	public static void main(String[] args) {
		
//		Electricity bill calculation
//
//		unit ≤ 100 → ₹5/unit
//
//		unit ≤ 200 → ₹8/unit
//
//		else → ₹10/unit

		
		int unit=300;
		int bill;
		
		if(unit<=100)
		{
			bill=unit*5;
		
		}
		else if(unit<=200)
		{   
			bill=unit*8;
			
		}
		else {
			 bill=unit*10;
		}
			System.out.print("total bill=$"+bill);
		}
	}


