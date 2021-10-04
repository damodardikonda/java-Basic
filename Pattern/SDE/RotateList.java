class RotateList{
	Node head = null, tail = null;

	class Node{

		int data = 0;
		Node next = null;

		Node(int data){

			this.data = data;
		}
	}

	void insert(int data){

		Node newNode = new Node(data);

		if(head == null){

			head = newNode;
			tail = newNode;
			head.next = null;
			tail.next = null;
		}else{

			tail.next = newNode;
			tail = newNode;
			tail.next = null;
		}
	}

	public void printList(){

		Node n = head;
		while(n != null){

			System.out.println(n.data);
			n = n.next;
		}
	}



	void rotateList(int k ){

		if(head == null || head.next == null || k == 0)
			System.out.println("head is empty");
		
		 Node temp = head;
		 int count = 0;
		 while(temp != null){
		 	count++;
		 	temp = temp.next;
		 }

   		 temp.next = head;
	     k = count - k % count;
		  System.out.println(" k = " + k);
		 Node temp2 = head;
		 while( k > 0){

		 	temp2 = temp2.next;
		 	k--;
		 } 

		 head = temp2.next;
		 temp2.next = null;

	}
	public static void main(String[] args) {
		
		RotateList rl = new RotateList();

		rl.insert(1);
		rl.insert(2);
		rl.insert(3);
		rl.insert(4);
		rl.insert(5);

		rl.printList();

		rl.rotateList(3);

		rl.printList();
	}
}