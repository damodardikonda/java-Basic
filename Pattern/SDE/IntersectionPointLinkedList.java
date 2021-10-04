/*

 Find out the intersection point of two linked list..

    e.g   2 --> 1 --> 8 --> 7-->6
    2 -->8-->1-->3--> 8 --> 7-->6

    1lya linked-list la l1 assign kara . 2rya linkedlist la l2 assign kara
    l1 sampali ki l1 madhe l2 cha head assign karaycha ani l2 sampali ki l2 madhe l1 cha head assin karaycha

*/


class IntersetionLinkedList{

	static class Node{

		int data;
		Node next;
	}

	static Node insert(Node root , int data){

		Node temp = new Node() , ptr;
		temp.data = data;
		temp.next = null;

		if(root == null)
			root =temp;
		else{

			ptr = root;
			while(ptr.next != null)
				ptr = ptr.next;
			ptr.next = temp;
		}

		return root;
	}

	static void display(Node root){

		Node n = root;

		while(n != null){

			System.out.println(n.data);
			n = n.next;
		}
	}

	static Node findIntersectionPoint(Node headA , Node headB){

		if(headA == null || headB == null ){

			return null;
		}

		Node a = headA;
		
		Node b = headB;

		while(a != b){
			System.out.print("a =  " + a.data + " b = " + b.data );
			if(a==null)	{
				a.next = headB;
			}		
			if( b == null){
				b.next = headA;
			}
			
			a = a.next;
			b = b.next;	
			System.out.println();
		}

		return a;
	}
	public static void main(String[] args) {
		
		Node root1 =  null , root2 = null , root = null;

		root1 = insert(root1 , 2);
		root1 = insert(root1 , 1);
		root1 = insert(root1 , 8);
		root1 = insert(root1 , 7);
		root1 =  insert(root1 , 6);

		root2 = insert(root2 , 2);
		root2 = insert(root2 , 8);
		root2 = insert(root2 ,1);
		root2 = insert(root2 , 3);
		root2 = insert(root2 , 8);
		root2 =  insert(root2 , 7);
		root2 = insert(root2 , 6);


		display(root1);
		display(root2);
		try{

			root = findIntersectionPoint(root1 , root2);
			System.out.println(" Intersection value is " + root.data);
	}
		catch(NullPointerException ne){
			System.out.println(" Null pointer exception");
		}
		

	}
}