
import java.util.*;
class LinkedList{
	Node head;

	static class Node{
		int data;
		Node next;
		Node(int d ){
	
			 data = d;
			 next = null;	
	}
}

       public void printList(){

	    Node n = head;
	    while(n != null){
		System.out.println(n.data);
		n=n.next;
		}	
	}

	public void pushBegin(int val){
		
		Node a = new Node(val);
		a.next = head;
		head = a;
	}

	public void insertMid(int x , int pos){
		Node n = head;		
		Node newNode = new Node(x);

		for(int  i = 0 ; i < pos ; i++){
			
			n = n.next;

			if(n == null)
				System.out.println("Cant Insert");
					
		}

			newNode.next = n.next;
			n.next = newNode;		
}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		LinkedList l1  = new LinkedList();
		l1.head = new Node(10);
		Node second = new Node(20);
		Node Third = new Node(30);
		
		l1.head.next = second;
		second.next = Third;
		l1.printList();

		System.out.println("Enter element at begining");
		int val = sc.nextInt();
		l1.pushBegin(val);

		l1.printList();	

		System.out.println("Enter the number you want to insert ");
		int x = sc.nextInt();
		
		System.out.println("Enter pos " );
		int pos = 2;

		l1.insertMid(x,pos);

		l1.printList();	
	}
}
