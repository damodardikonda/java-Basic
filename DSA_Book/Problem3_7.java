/*

	3.7 Consider the implementation of CircularlyLinkedList.addFirst, in Code Fragment 3.16. The else body at lines 39 and 40 of that method relies on a locally
	declared variable, newest. Redesign that clause to avoid use of any local variable.

*/

import java.util.*;

class Circular_Linked_List{

	Node head , tail , newNode;
	class Node{

		int data = 0;
		Node next =null;

		Node(int data){

			this.data = data;
			this.next =null;
		}
	}

	void addFirst(int data){

		if(head == null){

			tail = new Node(data);
			head= newNode = tail;
			newNode.next = head;
		}else{

			tail = new Node(data);
			newNode.next = tail;
			newNode = tail;
			tail.next = head;
		}
	}

	void printList(){

		Node n = head;
		do{
			System.out.println(n.data);
			n = n.next ;
		}
		while(n != head);
	}
	public static void main(String[] args) {
		
		Circular_Linked_List cll = new Circular_Linked_List();
		cll.addFirst(10);
		cll.addFirst(20);
		cll.addFirst(30);
		cll.addFirst(40);
		cll.addFirst(50);

		cll.printList();
	}
}