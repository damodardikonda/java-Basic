class PostOrderTree{

	class Node{

		int data = 0;
		Node left , right = null;
		
		Node(int data){

			this.data = data;

		}
	}

	Node root;

	void insert(int data){

		root = insPostOrder(root , data);
	}

	Node insPostOrder(Node root , int data){

		if(root == null){

			root = new Node(data);
	
		}

		if(root.data > data){
			
			root.left= insPostOrder(root.left , data);
		}else if(root.data < data){

			root.right = insPostOrder(root.right , data);
		}

		return root;
	}

	void postorder(){

		postOrderT(root);
	}

	void postOrderT(Node node){

		if (node == null)
			 { return; } 
		postOrderT(node.left);
		postOrderT(node.right); 
		System.out.printf("%s ", node.data);
	}
	public static void main(String[] args) {
		
		PostOrderTree pos = new PostOrderTree();
		pos.insert(30);
		pos.insert(20);
		pos.insert(10);
		pos.insert(25);
		pos.insert(35);
		pos.insert(50);

		pos.postorder();
	}
}