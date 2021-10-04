class CircularList{

	Node head , tail;

	class Node{

		int data;
		Node next;

		Node(int data ){

			this.data = data;
		}

	}

	public void addElement(int x){

			Node newNode = new Node(x);

			if(head == null){

				head = newNode;
				tail = newNode;
				newNode.next = head;
			}else{

				tail.next = newNode;
				tail = newNode;
				tail.next = head;
			}
	}

	void printList(){
		Node n = head;

		do{

			System.out.println(n.data);
			n = n.next;
		}while(n != head);
	}
	public static void main(String[] args) {
		
		CircularList cl = new CircularList();

		cl.addElement(10);
		cl.addElement(20);
		cl.addElement(30);
		cl.addElement(40);
		cl.addElement(50);
		cl.addElement(60);
		cl.addElement(70);
		cl.addElement(80);


		System.out.println("Elements are :- ");
		cl.printList();
	}
}