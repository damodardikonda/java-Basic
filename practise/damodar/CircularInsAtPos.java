class CircularIns{
Node head,tail = null;
	class Node{

		int data ;
		Node next;

		Node(int data){

			this.data = data;
		}

		Node head,tail = null;
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
    public void printList(){

    	Node n = head;

    	do{

    		System.out.println(n.data);
    		n = n.next;
    	} while( n != head);
    }
    
    public void insertAtPos( int pos , int x){

    	Node newNode = new Node(x);
    	Node n = head;
    	for (int i = 0 ; i < pos-1 ; i++ ) {
    		 
    		 n = n.next;
    	}
    	newNode.next = n.next;
    	n.next = newNode;
    }
	public static void main(String[] args) {
		
		CircularIns ci = new CircularIns();

		ci.addElement(10);
		ci.addElement(20);
		ci.addElement(30);
		ci.addElement(40);
		ci.addElement(50);
		ci.addElement(60);

		ci.printList();

		ci.insertAtPos(2,80);

		System.out.println("Ins at given pos");
		ci.printList();
	}
}