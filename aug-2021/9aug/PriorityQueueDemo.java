import java.util.*;

class PriorityDemo{

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();

		pq.offer(25);
		pq.offer(8);
		pq.offer(5);	
		pq.offer(35);
		pq.offer(28);
		pq.offer(15);

		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

		System.out.println(pq);
	}
}