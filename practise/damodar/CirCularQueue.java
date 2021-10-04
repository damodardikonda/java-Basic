
import java.util.*;

class CircularQueue{

		ArrayList<Integer> queue = new ArrayList();
		int size = 0 ;
		int front = -1;
		int rear = -1;
		CircularQueue( int size ){

				this.size = size;
				front = -1 ; 
				 rear = -1;
		
		}


	public void enQueue( int d){

			if(isFull()){

				System.out.println("Overflow");
			}else if ( rear == -1){

				front = 0 ;
				rear = 0;
				queue.add(rear , d);
			}else if( (rear == size-1) &&( front != 0))	{

				queue.set(rear , d);
			}else {
					rear = (rear + 1 );
				if(front < rear)
					queue.add(rear , d);
				else
					queue.set(rear , d);
			}
	}

	public Boolean isFull(){

		if((front == 0 && rear == size-1) && (rear == (front-1) %(size-1)))
				return true;
		else
			return false;
	}

	public Boolean isEmpty(){

		if( front == -1 && rear == -1)
			return true;
		else 
			return false;
	}

	public void deQueue(){

		if(isEmpty())
			System.out.println("Under-Flow");
			
		System.out.println(queue.get(front));

 		 if(front == rear){

			front = -1;
			rear = -1;
		}
		else if( front == size-1){

			front = 0 ; 
		}else{

			front++;
		}
	}

	public void dispQueue(){

		if(front == -1 )
			System.out.println(" Overflow ");
		else if (rear >= front){

			for (int i = front ; i <= rear  ; i++ ) {
				
				System.out.println(queue.get(i));
			}
		}else{

			for (int i = front ; i < size ; i++) {
				
				System.out.println(queue.get(i));
			}

			for (int i = 0 ; i <= rear ; i++ ) {
				
				System.out.println(queue.get(i));
			}
		}
	}
	public static void main(String[] args) {
		
		CircularQueue queue = new CircularQueue(5);

			if(queue.isFull())
				System.out.println("Queue is full ");
			else 
				System.out.println(" Queue is not full");



			if(queue.isEmpty())
				System.out.println("Queue is Empty ");
			else 
				System.out.println(" Queue is not Empty ");
	
			queue.enQueue(10);
			queue.enQueue(60);
			queue.enQueue(30);
			queue.enQueue(40);
			queue.enQueue(20);
		    queue.enQueue(90);
			queue.enQueue(110);
			queue.enQueue(290);

			queue.dispQueue();


			System.out.println(" after deleting a queue elements : ");
			queue.deQueue();
			queue.deQueue();
			queue.deQueue();
		

			queue.dispQueue();
			
			if(queue.isFull())
				System.out.println("Queue is full ");
			else 
				System.out.println(" Queue is not full");

	}
}