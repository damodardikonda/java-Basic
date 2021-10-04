class ReverLink{

	static Node head;

	static class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}


	}


	public void printList(){
		
		Node n = head;

		while(n.next != null){
			System.out.println(n.data);
			n = n.next;
		}
	}

	Node reverseLink(Node head ){
		
		Node current = head;
		Node next = null;
		Node previous = null;

		while(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		return previous;
	}	
	public static void main(String[] args){

		ReverLink rl = new ReverLink();
		rl.head = new Node(20);
		rl.head.next = new Node(50);
		rl.head.next.next = new Node(80);
		rl.head.next.next.next = new Node(100);
		rl.head.next.next.next.next = new Node(120);

		System.out.println("Linked List is = " );
		rl.printList();

		head = rl.reverseLink();
		System.out.println("After Reversing ana List = ");
		rl.printList();
	}
}
 