class BinarySearch{

	static class Node{

		int data = 0;

		Node left , right = null;

		Node(int data){

			this.data = data;
		}

	}
		Node root = null;

	public Node search(Node root , int data){

		if(root.data == data){

			System.out.println(root + " Found");
		}

		search(root.left , data);
		search(root.right , data);
		return root;
	}
	public static void main(String[] args) {
		
		BinarySearch bs = new BinarySearch();
		
		bs.root = new Node(10);
		
		bs.root.left = new Node(20);
		bs.root.right = new Node(30);

		bs.root.left.left = new Node(40);
		bs.root.left.right = new Node(50);

		bs.root.right.left = new Node(60);
		bs.root.right.right = new Node(70);

		bs.root = bs.search(bs.root , 30);

		System.out.println(bs.root + " Found");
	}
}