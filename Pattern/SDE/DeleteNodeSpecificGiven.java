/*

	Write a function to delete a singly-linked list. you will not be gven access to head of linked list ,
	insted you have the vlue of linked list..

*/

class DeleteNPos{
	Node head = null , tail = null;
	Node temp=null;
	class Node{

		Node next = null;
		int data = 0;

		Node(int data ){

			this.data = data;
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

	void delVal(int val){
		Node temp = head;
		while(temp.data != val){

			temp = temp.next;
		}
		temp.next.data = temp.next.next.data;
		temp.next.next =  temp.next.next.next;
	}

	void printList(){

		Node n = head;

		while(n !=  null){

			System.out.println(n.data );
			n=n.next;
		}
	}
	public static void main(String[] args) {
		
		DeleteNPos  rll =  new DeleteNPos();
		
		rll.insert(10);
		rll.insert(20);
		rll.insert(30);
		rll.insert(40);
		rll.insert(50);

		rll.printList();

		rll.delVal(30);
		rll.printList();
	}
}