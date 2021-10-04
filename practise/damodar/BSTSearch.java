class BSTSearch{

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

	 	if(root == null)
	 		root = new Node(data);
	 	if(root.data < data)
	 		root.right = insRoot(root.right , data);
	 	else if ( root.data > data) {
	 		
	 		root.left = insRoot(root.left , data);
	 	}

	 	return root;
	 }

	 void s(int data){

	 	root = search( root , data);

	 	System.out.println(root.data + " Found");
	 }
	 Node search(Node root , int data){

	 	if(root == null || root.data  == data )
	 		return root;
	 	if(root.data < data)
	 		return	search(root.right , data);
	 	else
	 		return search(root.left , data);
	 }
	public static void main(String[] args) {
		
		BSTSearch b = new BSTSearch();
		b.insert(10);
		b.insert(20);
		b.insert(30);
		b.insert(40);
		b.insert(50);
		b.insert(60);

		b.s(20);
	}
}