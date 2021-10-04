
import java.util.*;
class QOperation{

	public static void main(String[] args) {
		
		Queue<Integer> q = new PriorityQueue<>();

		q.add(1);		
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);


		System.out.println("Peek() method = " + q.peek());

		System.out.println("After Peek method queue = " + q);

		System.out.println(" Removing head =  " + q.remove());

		System.out.println("After Peek method queue = " + q);

		System.out.println("Poll method in java = " + q.poll());

		System.out.println("After poll method = " + q);
	}
}