package generics;

import java.util.ArrayList;

public class List {
	public static void main(String []args)
	{
	ArrayList list=new ArrayList();
   list.add(22);
   list.add("abc");
   list.add(new int[] {1,2,3});
   
   
   System.out.println(list);

}
}