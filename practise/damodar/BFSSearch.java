class BinaryTrees{

	static class Node{

			int data = 0;
			Node left , right = null;
			Node(int data){

				this.data = data;
			}
	}

	Node root = null;

	public void printList(){

		int h = height(root);

		for (int i = 1 ; i <= h ; i++ ) {
			
			printDFS( root ,  i);
		}
	}

	public void printDFS(Node root , int level ,int val){

		if(root == null)
		
		if(level == 1){
			if(root.data == val)			
			System.out.println(root.data);
		}else{

			printDFS(root.left , level-1);
			printDFS(root.right , level-1);
		}	
	}

	int height(Node root){

	if( root == null)
			return 0;
	else {
		int lheight =height (root.left);
		int rheight = height(root.right);

		if(lheight >rheight)
			return (lheight+1);
		else
			return (rheight+1);
	}

}

	public static void main(String[] args) {
		
		BinaryTrees bt = new BinaryTrees();

		bt.root = new Node(30);
		bt.root.left = new Node(20);
		bt.root.right = new Node(40);

		bt.root.left.left = new Node(10);
		bt.root.left.right = new Node(25);

	
		bt.root.right.left = new Node(35);
		bt.root.right.right = new Node(45);
		
		bt.root.left.left.left = new Node(5);
		bt.root.left.left.right = new Node(15);	

		
	}
}

