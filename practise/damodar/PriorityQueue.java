class PriorityQueue{

	int queue[];
	int front = -1;
	int rear = -1;
	int size = 0;
	PriorityQueue(int size){

		queue = new int[size];
		this.size = size;
	}

	public void enQueue(int d){

		if((front == 0) && (rear == size-1)){

			System.out.println("Overflow");
		}else{
			rear++;
			queue[rear] = d;

			System.out.println(d + " inserted ");
		}
	}

		public void PriorityQ(){

			for (int i = 0 ; i < size -1  ; i++ ) {
				
				for (int j = i+1 ; j < size ; j++ ) {
					
					if(queue[i] < queue[j]){

							int temp = queue[i];
							queue[i] = queue[j];
							queue[j] = temp;
					}
				}
			}
		}

	public void deQueue(){

		if (isEmpty()){

			System.out.println(" UnderFlow ");
		}
			else if( front == -1)
				front = 0;

		else{
					if(front >= rear){

					front = -1;
					rear = -1;
			}
			
				int item = queue[front];
				front++;
				System.out.println(item + " is deleted");
		}
	}
	public void deQueue(){

			if(isEmpty()){
				System.out.println("Underflow");
				System.exit(1);
			}else{
					if(front >= rear){

						front = -1;
						rear = -1;
					}
			System.out.println(queue[front]+"Element deleted ");
			front++;
		}
}
	public Boolean isEmpty(){

		if((front == -1) && (rear == -1))
			return true;
		else return false;
	}
	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue(5);
		pq.enQueue(2);
		pq.enQueue(50);
		pq.enQueue(10);
		pq.enQueue(20);
		pq.enQueue(30);

		
		pq.PriorityQ();
		pq.deQueue();
		pq.deQueue();

		
	}
} 