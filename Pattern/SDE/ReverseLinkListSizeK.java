/*

jevde k nodes dile stil tevdech reverse krr
ani jar ka tevde element nastil tr kahich nko kru

e.g - 1	--> 2 --> 3 --> 4 --> 5 --> 6 --> 7 --> 8                 k = 3

		3 --> 2 --> 1  6 --> 5--> 4  7 --> 8


		ata ikde 7 and 8 reverse nai kele ka karan tyanci total 3 nai ye
*/

class ReverseKNode{

	Node head = null , tail = null;
	Node temp=null;
	class Node{

		Node next = null;
		int data = 0;

		Node(int data ){

			this.data = data;
		}

	}

	void pri(){

		printList(head);
	}

	void printList(Node head){

		Node n = head;

		while(n !=  null){

			System.out.println(n.data );
			n=n.next;
		}
	}

	void insert(int data ){
		
		Node newNode =new Node(data);

		if(head == null){

			head = newNode;
			tail= newNode ;
			head.next = null;
			tail.next = null;
		}else {

			tail.next = newNode;
			tail =  newNode;
			tail.next = null;
		}
	}

	void rev(int k){

		head = reversed(k);
		printList(head);
	}
	Node reversed(int k){

		if(head == null || k == 1)
			return head;

		Node dummy= new Node(0);
		dummy.next = head;

		Node curr = dummy, prev = dummy , nex = dummy;
		
		int count = 0;
		while(curr.next != null){
			curr = curr.next;
			count++;
		}

		while(count >= k){

			curr = prev.next;
			nex = curr.next;

			for (int i = 1 ; i < k ; i++) {
				
				curr.next = nex.next;
				nex.next = prev.next;
				prev.next = nex;
				nex = curr.next;
			}

			prev = curr;
			count = count-k;
		}

		return dummy.next;

	}
	public static void main(String[] args) {
		
		ReverseKNode rk =  new ReverseKNode();
		rk.insert(1);
		rk.insert(2);
		rk.insert(3);
		rk.insert(4);
		rk.insert(5);
		rk.insert(6);
		rk.insert(7);
		rk.insert(8);


		System.out.println(" Linked list is == ");
		rk.pri();
		System.out.println(" Reverse Linked lis is ");
		rk.rev(3);

		
	}
}