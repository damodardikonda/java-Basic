/*
	3.6
	Give an algorithm for finding the second-to-last node in a singly linked list in
	which the last node is indicated by a null next reference.
*/

import java.util.*;

class Second_Last_LL{

	Node head = null;
	Node tail = null;

	class Node{

		int data = 0;
		Node next = null;

		Node(int data){

			this.data = data;
			this.next = null;
		}
	}

	void insertAtBeg(int data){

		Node newNode = new Node(data);

		if(head == null){

			head = tail = newNode;
			head.next = null;
			tail.next = null;
		}else{

			tail.next = newNode;
			tail = newNode;
			tail.next = null;
		}
	}
		int second_last(){

			Node tail = head;

			while(tail.next.next != null){

				tail = tail.next;
			}

			int ans = tail.data;
			return ans;
		}
	

	public static void main(String[] args) {
		
		Second_Last_LL sl = new Second_Last_LL();
		sl.insertAtBeg(10);
		sl.insertAtBeg(20);
		sl.insertAtBeg(30);
		sl.insertAtBeg(40);
		sl.insertAtBeg(50);

		int ans = sl.second_last();

		System.out.println(" ans is " + ans);
	}
}