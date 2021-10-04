class DoublyRever{
	
	class Node{
		int data ;
		Node next;
		Node prev;
		
		Node (int data){
			this.data = data;
		}
	}

	Node head , tail = null;

	public void addElement(int data){

		Node newNode = new Node(data);

		if(head == null ){
			head = tail = newNode;
			head.next = null;
			head.prev = null;
		}else{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}
	public void reversePrint(){
			Node n = tail;
	
				while(n != head){
				System.out.println(n.data);
				n = n.prev;
			}if( n == head)
				System.out.println(head.data);		
		}
 
	public static void main(String[] args){
		
		DoublyRever ll = new DoublyRever();

		ll.addElement(10);
		ll.addElement(20);
		ll.addElement(30);
		ll.addElement(40);
		ll.addElement(50);
		ll.addElement(60);

		ll.reversePrint();
	}
}
