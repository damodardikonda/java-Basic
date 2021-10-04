/*

	R-3.11 Give an implementation of the size( ) method for the DoublyLinkedList class,
	assuming that we did not maintain size as an instance variable

*/

import java.util.*;

class Size_DoublyLL{

	Node head , tail ;

	class Node{

		int data = 0;
		Node next , prev;


		Node(int data){

			this.data = data;
			this.next =null ;
			this.prev = null;
		}
	}

	void insert(int data){

		Node newNode = new Node(data);

		if(head == null){

			head = tail = newNode;
			head.next = null;
			tail.next = null;
			head.prev = null;
			tail.prev = null;

		}else{

			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next =  null;
		}
	}

	int size_Doubly(){
		int size = 1;
		while(tail != head){
			size++;
			tail = tail.prev;
		}

		return size;
	}
	public static void main(String[] args) {
		
		Size_DoublyLL sl = new Size_DoublyLL();
		sl.insert(1);
		sl.insert(2);
		sl.insert(3);
		sl.insert(4);
		sl.insert(6);
		sl.insert(7);


		int s = sl.size_Doubly();

		System.out.println(" size = " + s);
	}
}