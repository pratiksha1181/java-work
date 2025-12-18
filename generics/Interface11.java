package generics;

public class Interface11 {
	public static void main(String[]args) {

		
		Objectadder <String> iad=new Objectadder <String> ();
		iad.id("abc", "def");
		System.out.println(iad.getinstance("abc"));
	     
	}

}
interface iid<T> // T IS THE TYPE OF YOUR INTERFACE
{
//you have only  decided the behaviour here/
	void id(T t1,T t2);
}

class Objectadder<T>implements iid<T>
{
	public void id(T t1,T t2) {
		System.out.println(t1);
		System.out.println(t2);
		
	}
	public int getinstance(T t) {
		if(t instanceof String)
		{
			return((String)t).length();
		}
		return 0;
	}
}