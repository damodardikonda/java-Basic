class LinkL{

	Node head;

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
	
		while(n != null){
		
			System.out.println(n.data);
			n = n.next;
		}
	}

	
	public void delFirst(){
		
		head = head.next;

	}

	public void delPos(int pos){
		Node n = head;
		for(int i = 0 ; i <pos-1 ;i++){
			n = n.next;
		}
		
		n.next = n.next.next;
		
	}

	public void delLast(){

		Node n = head;


		while(n.next.next!=null){
			n = n.next;
		}
		
		n.next = null;
	}
	public static void main(String[] args){

		LinkL ll = new LinkL();	
		
		ll.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth = new Node(50);
		
		ll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		ll.printList(); 

		System.out.println("Deleting first node");
		ll.delFirst();

		ll.printList();

		int pos = 2;
		ll.delPos(pos);


		System.out.println("Deleting md node");
		ll.printList(); 

		System.out.println("Deleting Last Node");
		ll.delLast();
	}
}
