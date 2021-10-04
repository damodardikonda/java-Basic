
class StartPointLL {

	Node head = null , tail =  null;

	class Node{

		int data = 0;
		Node next =null;

		Node(int data){

			this.data =  data;
		}
	}

	void insert(int data){

		Node newNode =new Node( data);
		
		if(head == null){

			head= newNode;
			tail = newNode;
			newNode.next  = head;
		}else{
			System.out.println(tail.data);
			tail.next  = newNode;
			tail = newNode;
			tail.next = null;
		}
		
		Node temp = head;
		int i = 1;

		while(i<=3){

			System.out.println(temp.data);
			temp = temp.next;
			i++;
		}

		tail.next = temp;

	}

	public int printStartingPoint(){

		Node slow = head;
		Node fast = head;
		Node entry = head;
		int flag = 0;
		while(slow != fast){

			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){

				while(entry != slow){

					slow = slow.next;
					entry = entry.next;

					if(entry == slow )
						flag = entry.data;
					else flag = 0;
				}
			}
		}

		return  flag;
	}
	public static void main(String[] args) {
		
		StartPointLL sp = new StartPointLL();
		sp.insert(1);
		sp.insert(2);
		sp.insert(3);
		sp.insert(4);
		sp.insert(3);
		sp.insert(6);
		sp.insert(7);
		sp.insert(8);
		sp.insert(9);
		sp.insert(10);
		sp.insert(3);

		int val = sp.printStartingPoint();

		System.out.println("startin point value is " + val);
	}
}