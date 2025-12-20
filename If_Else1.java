package Practice;

public class If_Else1 {

	public static void main(String[] args) {
		
//		Check if age is 18 or above
//		→ Print "Eligible to vote" else "Not eligible".

//		else does not have a condition - it runs when the if condition is false.
		
		int age=20;
		if(age >18)
		{
			System.out.print("Eligible to vote");
		}
		else {
			System.out.print("Not eligible");
		}
	}

}
