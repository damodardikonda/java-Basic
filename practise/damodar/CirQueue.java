import java.util.*;

class CirQueue{

		int size;
		int front;
		int rear;
	CirQueue(int size){

			this.size = size;
			front = -1;
			rear = -1;
	}

	ArrayList<Integer> queue = new ArrayList<>(size);

		public boolean isFull(){

			if((front == -1 && rear == size-1) && (rear == (front-1)%(size-1)))
				return true;
			else return false;
		}

		public boolean isEmpty(){

			if(front == -1 && rear == -1)
				return true;
			else 
				return false;

		}

		public void enQueue(int d){

			if(isFull()){

				System.out.println(" Queue is full");
			}else if (rear == -1){

					front = 0;
					rear = 0;
					queue.add(rear , d);
			}else if(rear == size -1 && front != 0){
				rear = 0;
				queue.set(rear , d);
			}else{

				rear = rear +1;

					if(rear > front){
						queue.add(rear,d);
					}else
					queue.set(rear,d);
			}

		}

		public void deQueue(){

			if(isEmpty()){

				System.out.println("Queue is empty");
			}else if(front == rear ){

				front = -1;
				rear = -1;
			}else if(front == size-1){

				front = 0;
			}

			System.out.println(queue.get(front)hn+ " is deleted");
				front++;
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
		}	}
	public static void main(String[] args) {
		

		CirQueue q = new CirQueue(5);

			if(q.isFull())
				System.out.println("Queue is full ");
			else 
				System.out.println(" Queue is not full");



			if(q.isEmpty())
				Sy stem.out.println("Queue is Empty ");
			else 
				System.out.println(" Queue is not Empty ");
	
			q.enQueue(10);
			q.enQueue(60);
			q.enQueue(30);
			q.enQueue(40);
			q.enQueue(20);
		    q.enQueue(90);
			q.enQueue(110);
			q.enQueue(290);

			q.dispQueue();


			System.out.println(" after deleting a queue elements : ");
			q.deQueue();
			q.deQueue();
			q.deQueue();
		

			q.dispQueue();
			
			if(q.isFull())
				System.out.println("Queue is full ");
			else 
				System.out.println(" Queue is not full");

	}
}