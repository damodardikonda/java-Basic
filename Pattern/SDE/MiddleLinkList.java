class MiddleLinkList{

	Node head  = null, tail = null;

	class Node{

		int data = 0;
		Node next =null;

		Node(int data){

			this.data = data;
		}
	}

	void insert(int data){

		Node newNode = new Node(data);

		if(head == null){

			head =  newNode;
			tail = newNode;
			head.next =null;
			tail.next = null;
		}else{

			tail.next = newNode;
			tail =newNode;
			tail.next = null;
		}
	}

	void printList(){

		Node n = head;

		while( n != null){

			System.out.println(n.data);
			n = n.next;
		}
	}

	
	void findMiddle(){

		Node slow = head;
		Node fast = head;

		while(fast != null || fast.next != null ){
			slow =  slow.next;
			System.out.println(fast.data);
			fast = fast.next.next;
			
		}

		System.out.println(" middle element is " + slow.data);
	}
	public static void main(String[] args) {
		
		MiddleLinkList mll = new MiddleLinkList();
		mll.insert(10);
		mll.insert(20);
		mll.insert(30);
		mll.insert(40);
		mll.insert(50);
		//mll.insert(60);

		mll.printList();

		mll.findMiddle();
	}
}