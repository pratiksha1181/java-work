package Practice;

public class Else_If2 {
	public static void main(String[] args) {

//	Try changing values:
//
//		units = 80 → 400
//
//		units = 150 → 1200
//
//		units = 250 → 2500
		
		
		int []unitArray= {80,150,250};
		
		for (int units:unitArray) {
			int bill;
		
		
		if(units<=100)
		{
			bill=units*5;
		}
		
		else if(units<=200)
		{
			bill = units * 8;
		}
		
		else{
			bill=units*10;
		}
		System.out.println("units:"+units+" total bill"+bill);
	}
	}
}
