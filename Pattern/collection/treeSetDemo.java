
import java.util.*;

class TreeSetDemo{

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(10);
		ts.add(3);
		ts.add(1);
		ts.add(2);
		ts.add(7);

		System.out.println(" ts ===>   " + ts);

		System.out.println(" Iterate using Iterator");
		Iterator<Integer> itr = ts.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		TreeSet<Integer> ts2 = new TreeSet<Integer>();

		ts2.add(20);
		ts2.add(29);
		ts2.add(21);
		ts2.add(25);
		ts2.add(23);

		System.out.println(" ts2 ===> "+ts2);
		System.out.println("Iterator ts2 using iterator ");
		Iterator<Integer> itr2 = ts.iterator();
		while(itr2.hasNext())
			System.out.println(itr2.next());

		System.out.println(" addAll() in treeset ");
		ts.addAll(ts2);		
		System.out.println(" Iterate using Iterator");
		Iterator<Integer> itr3 = ts.iterator();
		while(itr3.hasNext())
			System.out.println(itr3.next());
/*
		System.out.println(" print the values in descendingh order ");
		Iterator<Integer> it = ts.descendingIterator();
		while(it.hasNext())
			System.out.println(it.hasNext());
*/

			System.out.println(ts.pollFirst());
			System.out.println(ts);

			System.out.println(ts.pollLast());
			System.out.println(ts);
	}
}