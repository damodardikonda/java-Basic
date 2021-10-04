// Merge 2 linked list without using extra space ---------------
import java.util.*;
class GFG
{

// Representation of node
static class Node
{
	int data;
	Node next;
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


static Node mergeList(Node root1 , Node root2){

	if(root1 == null)
		return root2;
	if(root2 == null)
		return root1;
	if(root1.data > root2.data){

		Node temp =  root1;
		root1 = root2;
		root2 = root1;
	}

	Node res = root1;

	while(root1 != null &&  root2 != null){

		Node temp = null;

		while(root1 != null && root1.data < root2.data){

			temp = root1;
			root1 = root1.next;
		}
		temp.next = root2;

		temp = root1;
		root1 = root2;
		root2 = root1;
	}
	return res;
}
public static void main(String args[])
{
	Node root1 = null, root2 = null, root = null;

	// First linked list
	root1 = insert(root1, 5);
	root1 = insert(root1, 2);
	root1 = insert(root1, 3);
	root1 = insert(root1, 8);

	// Second linked list
	root2 = insert(root2, 1);
	root2 = insert(root2, 7);
	root2 = insert(root2, 4);
	root2 = insert(root2, 5);

	display(root1);
	display(root2);
	root = mergeList(root1,root2);

	display(root);
}
}

