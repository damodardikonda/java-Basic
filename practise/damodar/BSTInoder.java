class BSTree{

	class Node{

		int data = 0;
		Node left , right = null;

		Node(int data){

			this.data = data;
		}
	}

	Node root = null;

	void insert(int data){

		root = insRoot(root , data);
	}

	Node insRoot(Node root , int data){

		if(root == null){

			root = new Node(data);
		
		}

		if(data <= root.data)
			root.left = insRoot(root.left,data);
		else if(data > root.data)
			root.right = insRoot(root.right , data);

		return root;
	}

	public void inorder(){

		inOrder(root);
	}

	public void inOrder( Node root){

		if( root != null){
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		
	}}
	public static void main(String[] args) {
		
		BSTree b = new BSTree();
	
		b.insert(50);
		b.insert(40);
		b.insert(60);
		b.insert(30);
		b.insert(70);
		b.insert(45);
		
		b.inorder();
	}
}
