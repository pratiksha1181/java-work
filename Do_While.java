package Practice;

public class Do_While {

	public static void main(String[] args) {
		
//		The do/while loop is different: it will always run the code block at least once, even if the condition is false from the start.
		int i=0;
		do {
			System.out.print(i);
			i++;
		}while(i<5);
	}

}
