package Practice;

public class Do_While4 {

	public static void main(String[] args) {
		
		
		int i=20;
		
		do {
			System.out.println(i);
			
			if(i==1) {
			i--;
			}else {
				i-=2;
			}
		}while(i>=2);
	}

}
