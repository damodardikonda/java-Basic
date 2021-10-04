import java.util.*;
class StackSearch{

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();

		stack.push("Geeks");
		stack.push("For");
		stack.push("Geeks");
		stack.push("Ok");
	
		stackSearch(stack , "For");
	}

	static void stackSearch(Stack<String> s , String num){

		Integer pos =  s.search(num);

		if(pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found");
	}

}