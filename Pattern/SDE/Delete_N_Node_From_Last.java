/*

	2 --> 4 --> 1 --> 5 --> 6

	jar ka n == 2 dila asel tr shevtun 2 ra delete kr 5 delete kr
*/

class DeleteNNode{

	Node head = null , tail =null;

	class Node{
		int data = 0;
		Node next =  null;
		Node(int data){
			this.data = data;
		}

		Node(){

			data = 0;
		}
	}


	void insert(int data){

		Node newNode = new Node(data);

		if(head ==  null){

			head = newNode;
			tail = newNode;
			head.next = null;
			tail.next = null;
		}else{

			tail.next =  newNode;
			tail = newNode;
			tail.next = null;
		}

	}

	void delNPos(int pos){

		Node start = new Node();

		start.next = head;

		Node fast = start;
		Node slow = start;

		for (int i = 1; i <= pos ; i++) {
			fast = fast.next;
		}
		while(fast.next != null){
			fast = fast.next;
			slow = slow .next;
		}

		slow.next = slow.next.next;
	}

	void printList(){
		Node n = head;

		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	public static void main(String[] args) {
		
		DeleteNNode d  = new DeleteNNode();
		d.insert(2);
		d.insert(4);
		d.insert(1);
		d.insert(5);
		d.insert(6);

		d.printList();

		int pos = 4;

		d.delNPos(pos);

		d.printList();
	}
}
