/*
R-3.16 Implement the equals( ) method for the DoublyLinkedList class.
	
*/

import java.util.*;

class DLL_Equals{

	static class Node{

		int data = 0;
		Node next = null;
		Node prev = null;

		Node(int data){

			this.data = data;
		}
	};
	static Node tail = null;
	static Node insert(Node root , int data){

		Node newNode = new Node(data);
		tail = root;

		if(root == null){
			root = newNode;
			root.prev = null;
			root.next =null;
			//tail.prev = null;
			//tail.next = null;
		}else{

			tail.next = newNode;
			tail = newNode;
			tail.next = null;
		}

		return root;
	}

	static boolean equals(Node root1 , Node root2){

		int l1 = 1 , l2 = 1;
		int samenum = 1;
		Node n1 = root1;
		Node n2 = root2;
		while(n1 != null){

			l1++;
			n1 = n1.next;
		}

		while(n2 != null){

			l2++;
			n2 = n2.next;
		}

		if(n1 != n2)
			return false;
		else{
			n1 = root1;
			n2 = root2;
			
			while(n1 != null){

				if(n1.data == n2.data){
					samenum++;
				}

				n1 = n1.next;
				n2 = n2.next;
			}
		}

		if(samenum == l1)
			return true;
		else
			return false;
	}


	static void display(Node root){

		Node r=root;
		while(r != null){

			System.out.print(r.data + "-->");
			r = r.next;
		}
	}
	public static void main(String[] args) {
		

		Node root1 = null , root2 = null , root = null ;

		root1 =insert(root1 ,10 );
		root1 = insert(root1 , 20);
		root1 = insert(root1 , 30);
		root1 = insert(root1 , 40);

		root2 = insert(root2 , 10);
		root2 = insert(root2, 20);
		root2 = insert(root2 , 30);
		root2 = insert(root2 , 40);

		display(root1);
		System.out.println("-----------------------------------");
		display(root2);

		boolean ans = equals(root1 , root2);
		if(ans == true)
			System.out.println("Both LinkedList are equals");
		else
			System.out.println(" Both LinkedList are not equals");
	}
}