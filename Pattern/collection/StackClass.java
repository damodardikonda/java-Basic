import java.util.*;

class StackClass{

	public static void main(String[] args) {
		
		Stack s1 = new Stack();
		s1.push(4);
		s1.push(" Damodar ");
		s1.push(" Dikonda ");

		System.out.println(s1);


		Stack<String> s2 = new Stack();
		s2.push(" Damodar ");
		s2.push(" Niket ");
		s2.push(" tanmay ");
		s2.push(" aadesh ");

		System.out.println(s2);
		String firstele = s2.peek();
		System.out.println(" First element is " + firstele);
		System.out.println(s2);

		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());

		if(s1.empty())
			System.out.println("  Stack is empty ");
		else 
			System.out.println(" Stack is not empty ");

		int b = s2.search("Damodar");
		
		System.out.println(b);

	}
}