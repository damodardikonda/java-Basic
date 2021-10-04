//@@goal : changing the index of element

import java.util.*;

class LLSet{

	public static void main(String[] args) {
			
			LinkedList<Integer> l1 = new LinkedList<Integer>();

			l1.addFirst(1);
			l1.add(2);
			l1.add(3);
			l1.add(4);
			l1.add(5);
			l1.add(6);
			l1.add(7);
			l1.add(8);
			l1.add(9);
			l1.add(0);
			l1.add(11);

			System.out.println(l1);

			l1.set(7,100);
			l1.set(2,200);

			System.out.println(l1);



		}	
}