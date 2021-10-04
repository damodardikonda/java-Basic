import java.util.*;

import java.util.Comparator;

class SortLL{

	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();

		l1.add(10);
		l1.add(100);
		l1.add(300);
		l1.add(20);
		l1.add(30);
/*
		Collections.sort(l1);

		System.out.println(l1);

		System.out.println(" SIze of LinkedList is "+l1.size());
		l1.sort(Comparator.reverseOrder());
*/

		for (int i = 0 ; i < l1.size() ; i++ ) {
			
			System.out.print(l1.get(i) + " "); 
		}


		System.out.println(l1);
/*
		for (int i = l1.size()-1; i >= 0; i--) {
			
			System.out.print(l1.get(i) + " ");
		}
*/

	Collections.reverse(l1);
	System.out.println(l1); 
	}
}