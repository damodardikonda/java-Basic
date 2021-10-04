class TwoPtr{

	Node head;

	static class Node{
		int data ;
		Node next = null;

		Node(int data ){
			this.data = data;
		}

	}

	void printList(){
		
		Node n = head;

		while(n != null){
			System.out.println(n.data);
			n =n.next;
		}
	}   

	void middPtr(){
		
		Node slow = head;
		Node fast = head;

		while(fast != null && fast.next !=null){
			slow = slow.next;
			fast = fast.next.next; 
		}


		System.out.println("Middle element is = " + slow.data);
	}
	public static void main(String[] a){
		
		TwoPtr tw = new TwoPtr();

		tw.head = new Node(10);
		tw.head.next = new Node(20);
		tw.head.next.next = new Node(30);
		tw.head.next.next.next = new Node(40);
		tw.head.next.next.next.next = new Node(50);
		tw.head.next.next.next.next.next = new Node(70);

		tw.printList();

		
                tw.middPtr();
	}
}
