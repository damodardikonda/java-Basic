class FlatternLisnked{

	static class Node{

		int data = 0;
		Node next = null;
		Node bottom = null;

		Node(int data ){

			this.data = data;
		}

		Node(){};
	};

	static Node insert(Node root , int data){

		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		Node ptr ;

		if(root == null){
			root = temp;
		}else{

			ptr = root;

			while(ptr.next != null){

				ptr = ptr.next;
			
			}
				ptr.next = temp;
		}
			return root;
	}

	static Node flattern(Node root){

		if(root == null || root.next ==  null)
			return root;

		root.next = flattern( root.next);

		root = mergeList(root  , root.next);

		return root;
	}

	static Node mergeList(Node a , Node b){

		Node temp = new Node(0);
		Node res = temp;

		while(a != null && b != null){
			if(a.data < b.data){
				System.out.println(a.data + "a");
				temp.bottom = a;
				temp = temp.bottom;
				a = a.bottom;
			}else{

				temp.bottom = b;
				temp=temp.bottom;
				b =  b.bottom;
			}
		}

		if(a != null)
			temp.bottom = a;
		else temp.bottom = b;

		return res.bottom;
	}

	public static void printList(Node root){

		Node n = root;

		while(n != null){

			System.out.println(n.data);
			n =n.next;
		}
	}
	public static void main(String[] args) {
		
		Node root1 = null , root2 = null , root3 =null , root4 = null;

		root1 = insert(root1 , 5);
		root1 = insert(root1 , 7);
		root1 = insert(root1 , 8);
		root1 = insert(root1 , 30);
		System.out.println(" Root 1 is ");
		printList(root1);
		

		root2 =insert(root2 , 10);
		root2 = insert(root2 , 20);
		System.out.println(" Root 2 is ");
		printList(root2);


		root3 = insert(root3 , 19);
		root3 = insert(root3 , 22);
		root3 =  insert(root3 , 30);
		System.out.println(" Root 3 is ");
		printList(root3);


		root4 = insert(root4 , 28);
		root4 = insert(root4 , 35);
		root4 = insert(root4 , 40);
		root4 = insert(root4 , 45);
		System.out.println(" Root 4 is ");
		printList(root4);

		root1= flattern(root1);
		printList(root1);
	}
}