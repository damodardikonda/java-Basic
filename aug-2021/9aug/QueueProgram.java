import java.util.*;

class PresidentUS{

	public static void main(String[] args) {
		
		Queue q = new LinkedList();

		q.add("Bill Clinton ");
		q.add("George Bush");
		q.add(" Barack Obama ");
		q.add("Donald trump ");

		System.out.println(q);

		q.offer("Joe Biden");
		System.out.println(q);

		System.out.println(q.peek());
		System.out.println(q.element());
		System.out.println(q.poll());
		System.out.println(q.remove());
	}
}