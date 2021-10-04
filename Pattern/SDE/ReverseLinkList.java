class ReverseLinkList{
	Node head = null , tail = null;
	class Node{

		Node next = null;
		int data = 0;

		Node(int data ){

			this.data = data;
		}

	}

	void insert(int data){

		Node newNode =new Node(data);

		if(head == null){

			head = newNode;
			tail= newNode ;
			head.next = null;
			tail.next = null;
		}else {

			tail.next = newNode;
			tail =  newNode;
			tail.next = null;
		}
	}

	void reverse(){

		head =  reverseLink(head);
		printList(head);
	}

	Node reverseLink(Node head){

		Node current = head;
		Node previous =  null;
		Node next = null;

		while(current !=null){

			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return  previous;
	}

	void printList(Node head){

		Node n = head;

		while(n !=  null){

			System.out.println(n.data );
			n=n.next;
		}
	}
	public static void main(String[] args) {
		
		ReverseLinkList  rll =  new ReverseLinkList();
		rll.insert(10);
		rll.insert(20);
		rll.insert(30);
		rll.insert(40);
		rll.insert(50);

		//rll.printList();

		rll.reverse();
	}
}