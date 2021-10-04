import java.util.LinkedList;
import java.util.*;

class Link{

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		System.out.println(" add() ");
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(1,90);
		list.add(2,70);
		list.add(190);
		list.add(220);
		list.add(true);
		list.add("Damodar");
		System.out.println("Linked list is " + list);
		System.out.println("------------------------------------");

		System.out.println(" contains() in linkedlist ");
		System.out.println(" Check whether list has 190 or not "+list.contains(190));
		System.out.println(" Check whether list has 10000 or not "+list.contains(10000));
		System.out.println("------------------------------------");		

		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(10);
		l.add(10);
		l.add(1,90);
		l.add(2,70);
		//l.add("Damodar"); error
		System.out.println(l);
		System.out.println("------------------------------------");

		System.out.println("addAll()");
		LinkedList l2 = new LinkedList();
		System.out.println(" add() ");
		l2.add(7000);
		l2.add(8000);
		l2.add(9000);
		System.out.println("L2 = " + l2);

		System.out.println(" addfirst() ");
		l2.addFirst(1);
		System.out.println("L2 = " + l2);

		System.out.println(" addLast() ");
		l2.addLast(2);
		System.out.println("L2 = " + l2);

		Collection c = new ArrayList();
		c.add(10);
		c.add(20);
		c.add(50);

		System.out.println(" c = " + c);
		l2.addAll(c);

		System.out.println(" L2 = " + l2);
		System.out.println("------------------------------------");

		System.out.println(" clear() ");
		l2.clear();
		System.out.println(" After clearing a list " + l2);

		System.out.println(" get() , getFirst() , getLast() in LinkedList ");
		for (int i = 0 ; i < list.size()  ; i++ ) {
			
			System.out.println(list.get(i));
		}

		System.out.println(" First elements is = " + list.getFirst() );
		System.out.println(" Lst element is "  + list.getLast());
		System.out.println("------------------------------------");

		System.out.println(" indexOf() in list ");
		System.out.println(list.indexOf(190));
		System.out.println(" Variable on last index = "+list.lastIndexOf(10));
		System.out.println("------------------------------------");


		System.out.println(" listiterator() in java ");
		Iterator itr = list.listIterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		System.out.println("want to print a element from 3rd position");
		Iterator i = list.listIterator(3);

		while(i.hasNext()){

			System.out.println(i.next());
		}
	}
}