class DoublyLinkList{

	class Node{

		int data;
		Node next;
		Node prev;

		Node(int data){
			this.data = data;
		}
	}

	Node head , tail = null;

	public void addElement(int n){
	
		Node newNode = new Node(n);

		if( head == null){
		
			head = tail = newNode;
			newNode.prev = null;
			newNode.next = null;
		}
		else{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode ;
			tail.next = null;		}

	}

	public void printList(){
		
		Node n = head;
		
		while(n != null){
			System.out.println(n.data);
			n=n.next;		
		}
	}

	public void insertBeg(int n ){
		
		Node newNode = new Node(n);
		newNode.prev = null;
		newNode.next = head;
		head.prev = newNode;
		head = newNode;				
	}
	public static void main(String[] args){

		DoublyLinkList l1 = new DoublyLinkList();

		l1.addElement(10);
		l1.addElement(20);
		l1.addElement(30);
		l1.addElement(40);
		l1.addElement(50);

		l1.printList();

		l1.insertBeg(200);
		
		l1.printList();
	}
}


