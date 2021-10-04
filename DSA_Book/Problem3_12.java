/*

	Implement a rotate( ) method in the SinglyLinkedList class, which has semantics
	equal to addLast(removeFirst( )), yet without creating any new node.
	k = 2... k means from where you want to start the linked list
*/

import java.util.*;

class Rotate_LinkedList{

	Node head , tail ;

	class Node{

		int data = 0;
		Node next = null;

		Node(int data){

			this.data = data;
			this.next =next;
		}
	}

	void insert(int data){

		Node newNode = new Node(data);

		if(head == null){

			head = tail = newNode;
			head.next = null;
			tail.next = null;
		}else{

			tail.next = newNode;
			tail = newNode;
			tail.next = newNode;
		}
	}


	void rotate(int k ){

		Node n = head;

		int len = 1;

		while(n.next != null){
			len++;
			n = n.next;
		}

		n.next = head;
		 k  = len - k % len;


		while(k-- > 0){

			n =n.next ;
		}

		head = n.next;
		n.next = null; 
	}

	void printList(){

		Node n = head;

		while(n != null){

			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		
		Rotate_LinkedList rl = new Rotate_LinkedList();
		rl.insert(10);
		rl.insert(20);
		rl.insert(30);
		rl.insert(40);
		rl.insert(50);
		rl.insert(60);

		System.out.println(" printList before rotate");
		rl.printList();

		Scanner sc =new Scanner(System.in);
		int k = sc.nextInt();
		rl.rotate(k);

	System.out.println(" printList aṭēr̥ś");	
		rl.printList();
	}
}