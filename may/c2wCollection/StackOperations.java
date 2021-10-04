import java.util.*;

class StackOperations{

	public static void main(String[] args) {
		
		Stack s = new Stack();

		System.out.println(" Adding values in stack ");

		s.add("Amazon");
		s.addElement(" Microsoft ");
		s.push(" Apple ");
		s.add(" Persistent ");
		s.addElement(" Zensar ");
		s.push(" Sony ");
		s.push(" NVIDIA ");

		Enumeration e = s.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());

		System.out.println(" Remove and return the top  element");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s);

		System.out.println(" Return the top element ");
		System.out.println(s.peek());
		System.out.println(s);

		System.out.println(s.search("Amazon"));
		System.out.println( s.search(" Apple "));

		if(s.isEmpty())
			System.out.println(" Stack is empty ");
		else System.out.println(" Stak is not empty ");
	}
}