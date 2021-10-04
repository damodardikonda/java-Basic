import java.util.*;

class LinkedListDemo{

	public static void main(String[] args) {
		
		LinkedList ll =new LinkedList();

		ll.add("C");
		ll.add("CPP");
		ll.add("Java");
		ll.add("Pyton");
		ll.add("Java");

		System.out.println(ll);

		for (int i = 0 ; i < ll.size() ; i++) {
			
			System.out.println(ll.get(i));
		}

		//add(int index , String value)

		ll.add(2,"OS");
		ll.add(1,"Networking");
		System.out.println(ll);

		//addFirst()
		ll.addFirst("React");
		System.out.println(ll);

		//addLast()
		ll.addLast("Angular ");
		System.out.println(ll);

		//removeFirst()
		System.out.println( ll.removeFirst());

		//removeLast()
		System.out.println(ll.removeLast());
		
		//indexOf()
		int index = ll.indexOf("Java");
		System.out.println(" Index of java is "+ index);

		//lastIndexOf()

		int last = ll.lastIndexOf("Java");
		System.out.println(last);

		//removeFirst()
		System.out.println(ll.removeFirst());

		//removeLast()
		System.out.println(ll.removeLast());

		System.out.println(ll);
		//getFirst();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());

		// set()
			ll.set(2 , "Kernel");
		System.out.println(ll);
	}
}