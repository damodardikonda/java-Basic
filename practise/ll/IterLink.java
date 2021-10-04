//@goal : Traversing a alink list

import java.util.*;
class IterLink{

	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(2);
		l1.add(2);
		l1.addFirst(1);
		l1.addFirst(3);
		l1.addFirst(50);

		l1.add(2);
		l1.add(2);
		l1.addLast(10);
		l1.addLast(120);
		l1.add(2);
		l1.add(2);
		l1.add(2);

		for (int i = 0 ; i < l1.size() ; i++ ) {
			
			System.out.print(l1.get(i) + " ");
		}
	
	}
}