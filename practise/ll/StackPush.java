
import java.util.*;

class StackPush{

	public static void main(String[] args) {
		
		Stack s1 = new Stack();

		Stack<Integer> s2 = new Stack<Integer>();

		s1.push(10);
		s1.push("Damodar");
		s1.push(true);
		s1.push(3.16);

		s2.push(10);
		s2.push(30);
		s2.push(100);
		s2.push(200);

		System.out.println(s1);
		System.out.println(s2);
	}
}