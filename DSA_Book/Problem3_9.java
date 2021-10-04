/*

R-3.9 Give an implementation of the size( ) method for the SingularlyLinkedList class,
assuming that we did not maintain size as an instance variable

*/

import java.util.*;

class Size_LinkedList{

	Node head , tail;

	class Node{

		int data = 0;
		Node next ;

		Node(int data){

			this.data = data;
			this.next =null;
		}

	}

	void insert(int data){

		Node newNode =new Node(data);

		if(head ==null){

			head = tail = newNode;
			head.next = null;
		}else{

			tail.next = newNode;
			tail =newNode;
			tail.next =null;
		}
	}

	int size_Of_List(){

		int size = 0;

		Node n = head;

		while(n != null){

			size++;
			n =n.next;
		}

		return size;
	}
	public static void main(String[] args) {
		
		Size_LinkedList sl = new Size_LinkedList();
		Scanner sc =new Scanner(System.in);
		System.out.println( " Enter the size ");
		int size = sc.nextInt();

		for (int i = 0 ; i < size  ; i++ ) {
			
			sl.insert(sc.nextInt());
		}

		int s =sl.size_Of_List();
		System.out.println(" size = " + size);
	}
}