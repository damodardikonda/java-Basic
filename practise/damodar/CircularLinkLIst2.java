class CircularLinkList{

	Node head = null;

	Node tail = null;

	class Node{

		int data = 0;
		Node next = null;

		Node(int data){

			this.data = data ;
		}
	}

	public void create(int data ){

		if(head == null){

			head = new Node(data);
			tail = head;
			tail.next = null;
		}else{

			Node newNode = new Node(data);

			tail.next = newNode;
			newNode.next = head;
			tail = newNode;
		}
	}

	public void printList(){

		Node x = head ;
		
		boolean flag =  false;
		

			

		do{
			if(x == head){
				System.out.println("circular linked list");
				break;
			}

			else {
				System.out.println("Not a CircularLinkList");	
			}
		
		} while( x != head || x != null);

	}
	public static void main(String[] args) {
		
		CircularLinkList cl = new CircularLinkList();

		cl.create(10);

		cl.create(20);
		cl.create(30);
		cl.create(40);
		cl.create(50);

		cl.printList();
	}
}