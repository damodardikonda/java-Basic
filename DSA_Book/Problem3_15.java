/*

	Implement the equals( ) method for the CircularlyLinkedList class, assuming that
	two lists are equal if they have the same sequence of elements, with corresponding elements currently at the front of the list.

*/

import java.util.*;

class CircularLL_Equals{

	static class Node{
		int data = 0;
		Node next = null;
		Node(int data){

			this.data = data;
			Node next = null;
		}
	};

	static Node insert(Node root ,int data){

		Node newNode = new Node(data);
		Node ptr ;
		if(root == null){

			root = newNode;
			root.next = null;
		}else{

			ptr = root;
			while(ptr != null){

				ptr = ptr.next;
			}

			ptr.next = newNode;
			ptr = newNode;
			ptr.next = root;
		}

		return root;
	}

	static void printList(Node root){

		Node n = root;
		while(n != null){

			System.out.println(n.data + " -> ");
			n = n.next;
		}
	}

	static boolean equals(Node root1 , Node root2){

		Node n = root1 , n2 = root2;
		int c1 = c2 = 1 , x = 1 ;

		while(n !=null){
			c1++;
			n =n.next;
		}

		while(n2 != null){
			c2++;
			n2 = n2.next; 
		}

		if(c1 != c2)
			return False;
		else{

			n = root1;
			n2 = root2;

			while(n2 != null){
				if(n.data == n2.data)
					x++;

				n =n.next;
				n2 = n2.next;
			}
		}

		if(x == c1)
			return True;
		else return False;
	}
	public static void main(String[] args) {
		
		Node root1 = nulll , root2 = null , root = null;

		root1 = insert(root1 , 1);
		root1 = insert(root1 , 2);
		root1 = insert(root1 , 3);
		root1 = insert(root1 , 4);
		root1 = insert(root1 , 5);

		root2 = insert(root2 , 1);
		root2 = insert(root2 , 2);
		root2 = insert(root2 , 3);
		root2 = insert(root2 , 4);
		root2 = insert(root2 , 5);

		System.out.println(" first circular linked list is");
		printList(root1);

		System.out.println(" Second Circular linked list is");
		printList(root2);

		boolean b = equals(root1 , root2);

		if(b == True)
			System.out.println(" Both circular linked list are equal");
		else
			System.out.println(" Both circular linked list are not equal");

	}
}