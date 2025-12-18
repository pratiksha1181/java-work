package handling;

public class Exception {

	public static void main(String[] args) {
	

				Two two=new Two("ABC");
			}
			
		}
		class One
		{
			public One()
			{
				System.out.println("one class re");
			}
			public One(String str) {
				System.out.println(str+"parameterized constructor..");
			}
		}
		class Two extends One{
			public Two() {
				System.out.println("Two");
			}
			public Two(String str) {
				super(str);
				System.out.println("param 2:+str");
			}
		

	}


