package collection;
import java.util.Stack;

public class Stack_1 {
	
	public static void main(String[] args)
	{
		
		Stack<Integer> stack=new Stack<Integer>();
		
		stack.push(12);
		stack.push(23);
		stack.push(34);
		stack.push(7);
		stack.push(4);
		
//		System.out.println(stack.pop());
//		System.out.println(stack.peek());
//		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack.peek());
//		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack.peek());
//		System.out.println(stack);
//		System.out.println(stack.pop());
		
		
//		System.out.print(stack.push(3));
//		System.out.println(stack.remove(2));
//		System.out.println(stack);
		
		System.out.print(stack.removeFirst());
		System.out.println(stack);
		System.out.print(stack.removeLast());
		System.out.println(stack);
		
//		System.out.println(stack.get(3));
//	
//		
//		System.out.print(stack.peek());
		
		
	}

}
