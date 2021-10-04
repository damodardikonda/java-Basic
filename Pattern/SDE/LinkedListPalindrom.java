class LinkedListPa{

	Node head = null , tail =  null;

	class Node{

		int data  = 0;
		Node next =null;

		Node(int data ){

			this.data = data;
		}
	}
		void insert(int data){

			Node newNode = new Node(data);

			if(head == null){

				head = newNode;
				tail= newNode;
				head.next = null;
				tail.next =null;
			}else{

				tail.next = newNode;
				tail = newNode;
				tail.next = null;
			}
		}

		void printList(){

			Node n = head;

			while(n !=null){

				System.out.println(n.data);
				n =n.next;
			}
		}

		boolean palindrom(){

			if(head == null || head.next ==null)
				return false;

			Node fast = head;
			Node slow = head;

			while(fast.next != null && fast.next.next != null){
				
				slow = slow.next;
				fast = fast.next.next;
			}

			Node dummy = slow;
			
			Node temp = dummy.next;

			Node curr =  temp, previous = dummy , nex =  temp.next;

			while(temp != null){
				
				nex = temp.next;
				temp.next = previous;
				previous = temp;
				temp = nex;
			}


			//slow.next = previous;

			slow = slow.next;

			while(slow !=  null){

				if(head.data != slow.data){

					return false;
				}
				System.out.println(head.data);
				System.out.println(slow.data);
				head = head.next;
				slow = slow.next;

			}

			return true;
		}

	
	public static void main(String[] args) {
		
		LinkedListPa ls =  new LinkedListPa();
		ls.insert(1);
		ls.insert(2);
		ls.insert(3);
		ls.insert(3);
		ls.insert(2);
		ls.insert(1);

		ls.printList();
		if(ls.palindrom())
			System.out.println(" Linked List is palindrom ");
		else 
			System.out.println(" Linked List is not palindrom");
		ls.printList();
	}
		
}