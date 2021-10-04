
import java.util.*;

class DLListTraver{

	public static void main(String[] args) {

		LinkedList<Integer> l1 = new LinkedList<Integer>();

		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(70);

		System.out.println("Before Link List = " );
		System.out.println(l1);


		l1 = reverseList(l1);

		System.out.println("After Reversing link list = " + l1);
	
	}

	public static LinkedList<Integer> reverseList(LinkedList<Integer> l2){

		LinkedList<Integer> l3 = new LinkedList<Integer>();
		for (int i = l2.size()-1 ; i >= 0 ; i-- ) {
			
			l3.add(l2.get(i));
		}

		return l3;	
	}
}