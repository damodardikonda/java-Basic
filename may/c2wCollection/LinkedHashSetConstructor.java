import java.util.*;

class LinkedSetConstruct{

	public static void main(String[] args) {
		
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(1);
		hs.add(2);

		LinkedHashSet l = new LinkedHashSet(2);
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l);

		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.addFirst(500);
		ll.addLast(20);
		ll.add(8);
		ll.add(5);
		ll.addFirst(10);
		ll.addLast(20);

		LinkedHashSet lh = new LinkedHashSet(ll);

		Iterator itr = lh.iterator();

		while(itr.hasNext())
			System.out.println(itr.next());

	}
}