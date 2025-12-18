package multidimentional;

public class Second {
	public static void main(String[]args) {
		
		Two two=new Two();
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
		System.out.println("param 2:+str");
	}
}
