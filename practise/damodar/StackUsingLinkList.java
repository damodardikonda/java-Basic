class StackLink{

	Node head = null;

	class Node{

		int data ;
		Node next = null;

		Node(int data){

			this.data = data;
		}

	}

	public void push(int data){

		Node newNode = new Node(data);
		Node top = head;
		

		if(head == null){

			head = newNode;
			newNode.next = null;
		}else {

			top.next = newNode;
			newNode.next = null;
		}

	}

   public void pop(){
   		Node n = head;
   		if(head == null){

   			System.out.println("UnderFlow");
   		}else{

   				while(n.next.next != null){

   						n = n.next;
   				}
   		
		System.out.println(n.next.data + " is deleted");
   		
   				n.next= null; 

   		}
   }
	public static void main(String[] args) {
		
		StackLink sl = new StackLink();
		sl.push(10);
		sl.push(20);
		sl.push(30);
		sl.push(40);
		sl.push(50);
		sl.push(60);

		sl.pop();
		sl.pop();
		//sl.pop();
	}
}