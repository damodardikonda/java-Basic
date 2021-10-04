import java.util.*;

class Bt{

Node root;
	class Node{

		int data;
		Node left,right = null;

		Node(int data){

			this.data = data;
		}

	}
	void inOrder(){

		root =innorder(root); 
	}


	Node innorder(Node root){

		if(root!= null){ innorder(root.left);
		System.out.println(root.data);
		 innorder(root.right);
	}
		return null;
}

	Node create(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Root value");
		int x = sc.nextInt();
		Node newNode = new Node(x);

		if(x == -1)
		return null;	

		System.out.println("Enter left child and -1 for exit");
		x = sc.nextInt();
		newNode.left = create();



		System.out.println("Enter right child and -1 for exit");
		x = sc.nextInt();
		newNode.right = create();
			return newNode;
	}
	public static void main(String[] args) {
		
			Bt b = new Bt();
			
			b.create();
			b.inOrder();
	}
}