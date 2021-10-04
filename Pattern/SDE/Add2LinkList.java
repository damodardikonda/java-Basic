/*

Adding 2 lnked list-----------

carry  
					  1		 1		1
l1 = 	2 ---> 4 ---> 3 ---> null
l2 = 	5 ---> 6 ---> 7 ---> 9 ---> null
-------------------------------------------
sum 	7	   0	  1		 0		1

*/

// Merge 2 linked list without using extra space ---------------
import java.util.*;
class Add2LinkedList
{

// Representation of node
static class Node
{
	int data;
	Node next;

	Node(int data){

		this.data =data;
	}

	Node(){}


};

// Function to insert node in a linked list
static Node insert(Node root, int item)
{
	Node ptr, temp;
	temp = new Node();
	temp.data = item;
	temp.next = null;

	if (root == null)
		root = temp;
	else
	{
		ptr = root;
		while (ptr.next != null)
			ptr = ptr.next;

		ptr.next = temp;
	}
	return root;
}

// Function to print the
// nodes of a linked list
static void display(Node root)
{
	while (root != null)
	{
		System.out.print( root.data + " - > ");
		root = root.next;
	}
	System.out.print("null");
}

static Node addLinkedList(Node l1 , Node l2){

	Node dummy = new Node(0);
	Node temp = dummy;
	int carry = 0;

	while(l1 != null || l2 != null || carry == 1){

		int sum =  0;

		if(l1 != null){

			sum = sum + l1.data;
			l1 =  l1.next;
		}
		if(l2 !=null){

			sum = sum + l2.data;
			l2 = l2.next;
		}
		sum =  sum + carry;
		carry = sum /10;
		Node newNode = new Node(sum % 10);
		
		//System.out.println(newNode.data);
		temp.next = newNode;
		temp =  newNode;
		newNode. next = null;
	}

	return dummy.next;
}

public static void main(String args[])
{
	Node root1 = null, root2 = null, root = null;

	// First linked list
	root1 = insert(root1, 2);
	root1 = insert(root1, 4);
	root1 = insert(root1, 3);
	

	// Second linked list
	root2 = insert(root2, 5);
	root2 = insert(root2, 6);
	root2 = insert(root2, 7);
	root2 = insert(root2, 9);

	display(root1);
	display(root2);
	
	root = addLinkedList(root1 , root2);

	display(root);
	
}
}

