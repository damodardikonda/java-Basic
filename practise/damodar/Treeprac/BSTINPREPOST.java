class BstPrePoIn{

		Node root = null;

		class Node{

			int data ;
			Node left , right = null;

			Node(int data){

				this.data = data;
			}

		}

		void ins(int data){

			root = insert(root , data);
		}

		Node insert(Node root , int data){

			if(root == null){

				root = new Node(data);
			}else if(root.data < data)
			root.right = insert(root.right , data);
			else if (root.data > data){

				root.left = insert(root.left , data);
			}

			return root;
	}

	void pre(){

		preOrder(root);
	}

	void preOrder(Node root){
			if(root != null){
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
	}
}

		void post(){

			postOrder(root);
		}

		void postOrder( Node root){
				if(root != null){
			postOrder(root.right);
			postOrder(root.left);
			System.out.println(root.data);
		}} 
	public static void main(String[] args) {
		
		BstPrePoIn b = new BstPrePoIn();
		b.ins(10);
		b.ins(10);b.ins(190);b.ins(30);b.ins(50);b.ins(800);b.ins(200);b.ins(70);b.ins(100);b.ins(20);
		System.out.println("==============");
		b.pre();
		System.out.println("==============");
		
		b.post();
	}
}