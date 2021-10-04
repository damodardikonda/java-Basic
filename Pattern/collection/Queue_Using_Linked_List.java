import java.util.LinkedList;
import java.util.*;

class QueueLinkedList{

	public static void main(String[] args) {
		
		System.out.println(" Creating a Queue using LinkedList ");
		Queue q = new LinkedList();
		System.out.println();
		System.out.println();
		

		System.out.println("Adding an integer element into queue");
		q.add(10);
		System.out.println();
		System.out.println();
		

		System.out.println(" Adding multiple integer element in queue ");
		for (int i = 2 ; i < 10  ; i++ ) {
				q.add(10*i);
		}
		System.out.println();
		System.out.println();
		
		System.out.println("printing a queue ");
		System.out.println(q);
		System.out.println();
		System.out.println();

		System.out.println(" Adding string value in queue");
		q.add("damodar");
		q.add("niket");
		q.add("tanmay");
		System.out.println();
		System.out.println();

		System.out.println(" Iterating  a queue using iterator ");
		Iterator itr = q.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		System.out.println(" printing size of queue = " +  q.size());
		System.out.println();
		System.out.println();

		Object removedata = q.remove();
		System.out.println("removing data = " + removedata);
		System.out.println(q);
		System.out.println();
		System.out.println();
		
		Object remove = q.poll();
		System.out.println("removing data = " + remove);
		System.out.println(q);
		
		Object rem = q.peek();
		System.out.println("removing data = " + rem);
		System.out.println(q);
		System.out.println();
		System.out.println();
		q.add(1);
		removedata = q.element();
		System.out.println("removing data = " + removedata);
		System.out.println(q);
		System.out.println();
		System.out.println();

		if(q.isEmpty())
			System.out.println(" Queue is empty ");
		else 
			System.out.println(" Queue is not empty ");
	}
}