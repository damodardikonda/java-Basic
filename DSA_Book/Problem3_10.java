/*

	R-3.10 Give an implementation of the size( ) method for the CircularlyLinkedList class,
	assuming that we did not maintain size as an instance variable.

*/

import java.util.*;

class Size_CircularLL{

	Node head , tail ;

	class Node{

		int data = 0;
		Node next ;

		Node(int data){

			this.data = data;
			this.next =null;
		}
	}

	void insert(int data){

		Node newNode = new Node(data);

		if(head == null){

			head =tail = newNode;
			head.next =head;

		}else{

			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	void size(){

		Node n = head;
		int size = 0;
		do{

			size++;
			n = n.next;
		}
		while(n != head);

		System.out.println(size);
	}
	public static void main(String[] args) {
		
		Size_CircularLL sl =new Size_CircularLL();
		sl.insert(1);
		sl.insert(1);
		sl.insert(1);
		sl.insert(1);
		sl.insert(1);
		sl.insert(1);
		sl.insert(1);
		sl.insert(2);

		sl.size();
	}
}