import java.util.*;

class ArrayDequeDemo{

	public static void main(String[] args) {
		
		Deque d = new ArrayDeque();
		d.add("C");
		d.addFirst("CPP");
		d.addLast(" Java ");
		d.push(" Flutter ");
		d.offerFirst(" Python ");
		d.offerLast(" JS ");


		System.out.println(d);

		System.out.println(d.poll());
		System.out.println(d);

		System.out.println(d.pollFirst());
		System.out.println(d);

		System.out.println(d.pollLast());
		System.out.println(d);

		System.out.println(d.remove());
		System.out.println(d);

		System.out.println(d.removeFirst());
		System.out.println(d);

		System.out.println(d.removeLast());
		System.out.println(d);

		System.out.println(d.peek());
		System.out.println(d);

		System.out.println(d.peekFirst());
		System.out.println(d);

		System.out.println(d.peekLast());
		System.out.println(d);

		d.add("C");
		d.addFirst("CPP");
		d.addLast(" Java ");
		d.push(" Flutter ");
		d.offerFirst(" Python ");
		d.offerLast(" JS ");

		System.out.println(" Iterator ============================================= ");
		Iterator itr = d.iterator();

		while(itr.hasNext()){

			System.out.println(itr.next());
		}

		System.out.println(" Iterator in descending order ===============================");		
		Iterator itr2 = d.descendingIterator();

		while(itr2.hasNext())
			System.out.println(itr2.next());
	}
}