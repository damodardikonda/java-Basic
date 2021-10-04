class DelDoublyLink{

	Node head , tail = null;

	class Node{
		int data ;
		Node prev = null ;
		Node next = null;

		Node(int data){
			this.data = data;
			
		}
	}

	public void printList(){
		
		Node n = head;

		while( n != null){
			System.out.println(n.data);
			n = n.next;
		}
	}

	public void addEle(int data){

		Node newNode = new Node(data);

		if(head == null){
			head = tail = newNode;
			head.prev = null;
			head.next = null;
		}
		else{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	public void delLast(){
		
		Node n =  head ;

		while(n.next.next != null){
			n=n.next;
		}

		n.next = null;
	}

	public void delFirst(){
		
				
		head = head.next ;
		head.prev = null;
	}

	public void delAtPos(int pos){
		Node n = head;	
		for(int i = 0 ; i < pos-1 ; i++)
			n = n.next;
		n.next.next.prev = n;
		n.next = n.next.next;
	}
	public static void main(String[] args){
		
		DelDoublyLink l1 = new DelDoublyLink();

		l1.addEle(10);
		l1.addEle(20);
		l1.addEle(30);
		l1.addEle(40);
		l1.addEle(50);
		l1.addEle(60);
		l1.addEle(70);
		l1.addEle(80);
		int pos = 2;
		System.out.println(" Linked List is :  ");
		l1.printList();

		l1.delFirst();
		System.out.println(" Linked List is :  ");
		l1.printList();

		l1.delLast();
		System.out.println(" Linked List is :  ");
		l1.printList();

 		l1.delAtPos( pos );
		System.out.println(" Linked List is :  ");
		l1.printList();
              
	}
}
