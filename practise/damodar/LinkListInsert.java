class LinkLis{
	Node head;

	static class Node{
		
		int data;
		Node next;
		
		Node(int data ){
			
			this.data = data;
			this.next = null;
		}

	

	}

	public void printList(){
	
		Node n = head;
		while(n!=null){

			System.out.println(n.data);
			n = n.next;
		}
	}

	public void insertPos(int  data , int pos){
		
		Node n = head;
		Node newNode = new Node(data);

		for(int  i = 0 ; i < pos ; i++){
			
			n = n.next;

			if(n==null)
			System.out.println("Not add");
		}	

		newNode.next = n.next;
		n.next = newNode;
	}

	public void insertLast(int d){

		Node newNode = new Node(d);
		Node n = head;

		while(n != null){
			n = n.next;
		}
		
		n.next = newNode;
		
    	}
	public static void main(String args[]){
	
	LinkLis ll = new LinkLis();
	//LinkLis.Node nn = ll.new Node(100);
	ll.head = new Node(10);
	Node sec = new Node(20);
	Node third = new Node(30);
	Node fourth = new Node(40);

	ll.head.next = sec;
	sec.next = third;
	third.next = fourth;

	ll.printList();

	int data = 90;
	int pos = 2;


	ll.insertPos(data , pos);

	System.out.println("After Adding at specific pos");

	ll.printList();

	System.out.println("Insert At Last ");
	ll.insertLast(1000);
	System.out.println("After Adding at Last");

	ll.printList();

}
}
