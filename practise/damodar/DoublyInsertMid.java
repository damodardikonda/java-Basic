class DoublyInsMid{

	class Node{
		int data; 
		Node prev ;
		Node next ;
		
		Node(int data ){
			this.data = data;
		}	
	}
	Node head,tail=null;

	public void addElement(int data ){
		
		Node newNode = new Node(data);
		
		if( head == null){
			head = tail = newNode;
			head.next = null;
			head.prev = null;
		}else{
			tail.next = newNode;
			newNode.prev = tail;
			newNode.next = null;
			tail = newNode;
	}
		
	}

	public void printList(){
		
		Node n = head;
		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
	}

	public void insAtPos(int data , int pos){
		Node n = head;
		Node newNode = new Node(data);

		for(int i = 0 ; i < pos-1 ; i++){
			n=n.next;
		}

		newNode.next = n.next;
		newNode.prev = n;
		n.next = newNode;
	}
	public static void main(String[] args){
		
		DoublyInsMid dim = new DoublyInsMid();

		dim.addElement(10);
		dim.addElement(20);
		dim.addElement(30);
		dim.addElement(40);
		dim.addElement(50);
		dim.addElement(60);
		dim.addElement(70);
	

		dim.printList();
		
		System.out.println("After inserting at pos :");
		dim.insAtPos(300 , 3);
	
		dim.printList();
		
	}
}
