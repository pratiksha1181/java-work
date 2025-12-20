package Practice;

public class Switch {

	public static void main(String[] args) {
		
//		The switch expression is evaluated once.
//		The result is compared with each case value.
//		If there is a match, the matching block of code runs.
//		The break statement stops the switch after the matching case has run.
//		The default statement runs if there is no match.

		
		int emp=102;
		switch(emp) {
		
		case 101:
		{
			System.out.print("shena");
			break;
		}
		case 102:
		{
			System.out.print("sandhya");
			break;
		}
		case 103:
		{
			System.out.print("pooja");
			break;
		}
		default:
		System.out.print("sakshi");
		}
		
		
//		When Java reaches a break keyword, it breaks out of the switch block.
//
//		This will stop the execution of more code and case testing inside the block.
//
//		When a match is found, and the job is done, it's time for a break. There is no need for more testing.
	}

}
