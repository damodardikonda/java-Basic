class QueueArray{

	int queue[];
	int front;
	int rear ;
	int size ; 

	void initialize(int size){

		queue = new int[size];
		size = size;
		front=-1;
			rear = -1;
	}

	public void enQueue(int x){

		if(isFull()){

			System.out.println("Overflow");
			//System.exit(1);
		}else if(front == -1)
			front = 0;
		{

			rear++;
			queue[rear] = x;
		}
		
		System.out.println(x + "inserted");
	}
	
	public void deQueue(){

			if(isEmpty()){
				System.out.println("Underflow");
			//	System.exit(1);
			}else{
					if(front >= rear){

						front = -1;
						rear = -1;
					}
			System.out.println(queue[front]+"Element deleted ");
			front++;
		}
}

	public boolean isFull(){

			if(front == -1 && rear == size-1)
					return true;
			else return false;
	}

	public boolean isEmpty(){

			if(front == -1 )
					return true;
			else return false;
	}

	public void print(){

		if(isEmpty()){

			System.out.println("Underflow");
			System.exit(-1);
		}
		else{

			for(int i = front ; i <= rear ;i++){

				System.out.println(queue[i]);
			}
		}
	}


	public static void main(String[] args) {
		
		QueueArray q = new QueueArray();
			q.initialize(7);


		if(q.isEmpty())
			System.out.println(" Queue is empty");


		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		q.enQueue(60);
//		q.enQueue(70);
		
		q.print();

		q.deQueue();
		q.deQueue();
		q.deQueue();

		q.print();

	}
}