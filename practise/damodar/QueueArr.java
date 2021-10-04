class Queue{

	int item[];
	int front ;
	int rear ;
	int capacity;
	
	public void initialize(int size){

		item = new int[size];
		capacity = size;
		front = -1;
		rear = -1;
	}

	public Boolean isFull(){

		if(front ==-1 && rear == capacity-1)
			return true;
		else
			return false;
	} 

	public Boolean isEmpty(){

		if(front == -1)
			return true;
		else 
			return false;
	}

	public void enQueue(int n){

		if(isFull()){

			System.out.println("Queue is Full / Overflow");
			System.exit(-1);
		}else if(front == -1){

			front = 0 ;
		}
		
		rear++;
		item[rear] = n;

		System.out.println( n + " Inserted");
	} 


	public void deQueue(){
		int ele = 0;
		if(isEmpty()){

			System.out.println(" Is Empty");
			System.exit(-1);
		} else{

			ele = item[front];

			if(front >= rear){

					front = -1;
					rear = -1;
			}

			front++;

			System.out.println(ele + " is deleted");
		}
	}

	public void print(){

		if(isEmpty()){

			System.out.println("Underflow");
			System.exit(-1);
		}
		else{

			for(int i = front ; i <= rear ;i++){

				System.out.println(item[i]);
			}
		}
	}
	public static void main(String[] args) {
		
		Queue q = new Queue();
		q.initialize(7);


		if(q.isEmpty())
			System.out.println(" Queue is empty");


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