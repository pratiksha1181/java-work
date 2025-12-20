package Practice;

public class Else_If {

	public static void main(String[] args) {
//		Check if a person is Child, Teenager, or Adult
//		age < 13 → Child
//		age < 20 → Teenager
//		else → Adult

		int age=15;
		
		if(age<13)
		{
			System.out.print("child");
		}
		else if(age<20){
			System.out.print("Teeneger");
		}
		else {
			System.out.print("Adult");
		}
		
	}

}
