class BST{

	Node root;

	class Node{
		int data ;
		Node left;
		Node right;
	
		Node(int data){

			this.data = data;
			left = null;
			right=null; 
		}

	}

		public void ins(int data){

			root = insert(root , data);
		}		
		Node insert (Node root , int data){
			
			if(root == null)
				root = new Node(data);
		else if (root.data < data)
			root.right =  insert(root.right , data);
		else if(root.data > data)
			root.left = insert(root.left , data);
		return root;
		}
			void ino(){

				inOrder(root);
			}
			void inOrder(Node root){

					if(root != null){

						inOrder(root.left);
						System.out.println(root.data);
						inOrder(root.right);
					}
			}
	
	public static void main(String[] args) {
		
		BST bst = new BST();
	
		bst.ins(10);

		bst.ins(20);
		bst.ins(500);
		bst.ins(900);
		bst.ins(50);
		bst.ins(60);
	bst.ino();
	}
}