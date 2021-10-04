class BST{
	
	class Node{

		int data = 0;
		Node left , right = null;
		Node(int data){

			this.data = data;
		}
	}

	Node root;

	BST(){


		root = null;
	}

	public void insert(int data){

		root = insRoot(root , data);

	}

	Node insRoot(Node root , int data){

		if(root == null){

			root = new Node( data);
		}

		if(root.data < data){

			root.right = insRoot(root.right , data);
		}else if (root.data > data){
			root.left = insRoot(root.left , data);
		}
		return root;
	}

	void pre(){

		preorder( root);
	}
	void preorder(Node root){

		if(root != null)
			
			{
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static void main(String[] args) {
		
		BST b = new BST();
		b.insert(30);
		b.insert(20);
		b.insert(10);
		b.insert(50);
		b.insert(80);
		b.insert(5);
		b.insert(1);
	
		b.pre();
	}
}