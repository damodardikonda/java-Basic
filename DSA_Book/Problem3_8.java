
/*
R-3.8 Describe a method for finding the middle node of a doubly linked list with header
and trailer sentinels by link hopping, and without relying on explicit knowledge
of the size of the list. In the case of an even number of nodes, report the node
slightly left of center as the middle. What is the running time of this method?
*/
import java.util.*;

class Middle_DoublyLL{

	Node head , tail =null;

	class Node{

		int data = 0;
		Node next ;
		Node prev ;

		Node(int data){

			this.data = data;
			this.next = null;
			this.prev = prev;

		}
	}

	void insert(int data){

		Node newNode =new Node(data);

		if(head==null){

			head = tail = newNode;
			head.next = null;
			head.prev =  null;
		}
		else{

			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next =null;
		}
	}

	void printList(){

		Node n = head;

		while(n != null){

			System.out.println(n.data);
			n =n.next;
		}
	}

	int findMid(){

		// By using head and tail
		Node n = head;
		while(n != tail){

			n = n.next ;
			tail =  tail.prev;
		}

		return n.data;
	}

	int findMid_TwoPtr(){

		Node fast_ptr = head;
		Node slow_ptr = head;

		while(fast_ptr != null && fast_ptr.next != null){

			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
		}

		return slow_ptr.data;
	}
	public static void main(String[] args) {
		
		Middle_DoublyLL md = new Middle_DoublyLL();
		md.insert(10);
		md.insert(20);
		md.insert(30);
		md.insert(40);
		md.insert(50);

		md.printList();

		int ans = md.findMid();
		System.out.println(" middle is " + ans);

		int ans2 = md.findMid_TwoPtr();
		System.out.println(" middle is " + ans2);
	}
}