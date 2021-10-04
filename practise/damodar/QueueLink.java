class Queue{

	Node head;

	class Node{

		int data;
		Node next;


		Node(int data){

			this.data = data;
			this.next = null;
		}
	}

	Node front , rear = null;

	public Boolean isEmpty(){

		if(head == null)
			return true;
		else 
			return false;
	}

	public void enQueue(int d){

		Node newNode = new Node(d);

		if(head == null){

			head = newNode;
			rear = newNode;
		}else{

			rear.next = newNode;
			rear = newNode;
			rear.next = null;
		}

	}

	public void deQueue(){
		Node front = head;
		if(front == null){

			System.out.println(" UnderFlow");
			System.exit(-1);
		}else{
			System.out.println(front.data + " is deleted ");
			front = front.next;
		}
	}


	public void print(){

		Node front = head;

		while(front != rear){

			System.out.println(front.data);
			front = front.next;
		}
	}
	public static void main(String[] args) {
		
		Queue q = new Queue();

		q.enQueue(10);

		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		q.enQueue(60);
		q.enQueue(70);
	
		q.print();

		q.deQueue();

		q.deQueue();

		q.deQueue();

		q.print();
	}
		}
