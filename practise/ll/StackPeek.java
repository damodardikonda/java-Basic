
import java . util.*;
class StkPeek{

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();

		s.push("Damodar");
		s.push("Tanmay");
		s.push("Niket");
		s.push("Adesh");
		s.push("Aditya");
		s.push("Vaibhav");

		System.out.println("Starting element is " + s.peek());

		s.pop();

		System.out.println(" Starting element is = " + s.peek());

		s.pop();
		s.pop();
		s.pop();
		s.pop();
		
		System.out.println(" Starting element is = " + s.peek());

		s.pop();
		boolean b = s.empty();
		System.out.println( " is stack is empty ?? "+b);
	}
}