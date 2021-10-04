/*

	Deetect a Cycle is present in linkedlist  or not;
*/

class DetectCycleLinkedList{

	Node head , tail = null;

	class Node{

		int data = 0;
		Node next = null;

		Node(int data){

			this.data = data;
		}
	}

	void insert(int data){

		Node newNode =new Node(data);

		if(head == null){

			head = newNode;
			tail = newNode;
			head.next = null;
			tail.next = null;
		}else{

			tail.next =newNode;
			tail = newNode;
			tail.next = head.next.next;
		}
	}


	boolean flag = true;

	boolean detectCycle(){

		Node fast = head;
		Node slow = head;

		while(fast != null || fast.next !=null){

			fast =  fast.next.next;
			slow = slow.next;
			if(fast == slow){
				flag = true;
				break;
			}

			else 
				flag = false;
		}

		return flag;
	}
	public static void main(String[] args) {
		
		DetectCycleLinkedList dll = new DetectCycleLinkedList();
		dll.insert(1);
		dll.insert(2);
		dll.insert(3);
		dll.insert(4);
		dll.insert(5);
		dll.insert(6);


		if(dll.detectCycle())
			System.out.println(" Circle is detected");
		else
			System.out.println(" circle is not detected");
	}
}