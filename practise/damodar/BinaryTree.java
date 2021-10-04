class Tree{

	static	class Node{

		int data = 0;
		Node left , right = null;

		Node(int data ){

			 this.data = data ;
			 this.left = null;
			 this.right = null;
		}
 

	}

	Node root;


	public static void main(String[] args) {
		
		Tree t = new Tree();
		t.root = new Node(10);

		t.root.left = new Node(20);
		t.root.right =  new Node(30);
		
		t.root.left.left = new Node(40);
		t.root.left.right =  new Node(50);

		t.root.right.left = new Node(60);
		t.root.right.right = new Node(70);
	}
}
