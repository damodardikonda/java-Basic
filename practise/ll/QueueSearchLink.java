import java.util.*;
class QueueSerch{

	public static void main(String[] args) {
		
		Queue<Integer> q = new PriorityQueue<>();

		Scanner sc = new Scanner(System.in);
		q.add(5);
		q.add(10);
		q.add(2);
		q.add(1);
		q.add(7);

	System.out.println("Enter no search");
		Integer s = (Integer) sc.nextInt();
	
	Iterator itr = q.iterator();

		while(itr.hasNext()){

			if(itr.next() == s){

				System.out.println("Found");
			}else
			System.out.println("Not found");
		}
		}
}