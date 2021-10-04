class CircularDel{
	Node head , tail = null;
	class Node{

		int data ;
		Node next = null;

		Node(int data){

			this.data = data;
		}
	}

	public void addElement(int x){

		Node newNode = new Node(x);

		if(head == null){

			head = newNode;
			tail = newNode;
			newNode.next = head;
		}
		else{

			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	public void delFirst(){
			head = head.next ;
		tail.next = head;

	}

	public void delLast(){

		Node n = head;

		while(n.next.next != head)
			n = n.next;

		n.next = head;
	}

	public void delPos(int pos){
		Node n = head;
		for (int i = 0 ; i < pos-2 ; i++ ) {
			
			n = n.next;
		}

		n.next = n.next.next;
	}
	public void printList(){

			Node n = head;

			do{
				System.out.println(n.data);
				n= n.next;
			}while(n != head);

	}
	public static void main(String[] args) {
		
		CircularDel cd = new CircularDel();
		cd.addElement(10);
		cd.addElement(20);
		cd.addElement(30);
		cd.addElement(40);
		cd.addElement(50);
		cd.addElement(60);

		cd.printList();

		System.out.println("Deleting first node");
		cd.delFirst();
		cd.printList();

		System.out.println("Deleting at last = ");
		cd.delLast();
		cd.printList();

		System.out.println("Del ata post 3");
		cd.delPos(2);
	cd.printList();
	}
}