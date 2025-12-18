package generics;
import java.util.ArrayList;
import java.util.List;
public class Framework {
	
	public static void main(String []args)
	{
	List<Object> list=new ArrayList<Object>(); 
   list.add(22);
   list.add("abc");
   
   
   System.out.println(list);
}
}