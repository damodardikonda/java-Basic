import java.util.*;

class QueueLinked{

	public static void main(String[] args)  {
		
		Queue<Integer> q = new LinkedList();

	/*	for (int  i = 0 ; i < 5 ; i++ ) {
			
			q.add(i);
		}

*/
		System.out.println(q);
/*		try{
		System.out.println("First element of Queue is  = " + q.element());}
		catch(NoSuchElementException n){}

		System.out.println(" Size of queue is = " + q.size());
		System.out.println("Removing an element "+q.remove());


		System.out.println("First element of Queue is  = " + q.element());
*/
		System.out.println("First element of Queue is  = " + q.peek());
		
	}
}