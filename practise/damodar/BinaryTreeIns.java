import java.util.Scanner;

class BinaryTreeIns{

	class Node{

		int data = 0;
		Node left = null;
		Node right = null;

		Node( int data ){

			this.data = data;
		}
	}

	Node root = null;

	void inOrder(){

	inOrederTraversal(root);
	
	}

	Node  inOrederTraversal(Node root){
			if(root != null){
			inOrederTraversal(root.left );

				System.out.println(root.data);
			 inOrederTraversal(root.right);
			return root;
	}
				return root;

}
	Node create(){

		Node root ;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of node (-1) if not want to insert");
		int x = sc.nextInt();

		if( x== -1 ){
			return null;
		}
		root = new Node(x);

		System.out.println("Enter the value of left child : ");

		x = sc.nextInt();

		root.left = create();

		System.out.println("Enter the value of Right child : ");

		x = sc.nextInt();

		root.right = create();
		return root;
	}
	public static void main(String[] args) {
		
		BinaryTreeIns bt = new BinaryTreeIns();
		bt.create();

		bt.inOrder();
	}
}