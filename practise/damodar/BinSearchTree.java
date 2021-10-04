class BinSearch{
		Node root;
	static class Node{

		int data ;
		Node left , right = null;

		Node(int data){

			this.data = data;
		}


}

		public Node Binsearch( Node root , int data){

			if(root != null){
			if(root.data == data ){
					System.out.println("Found " + root.data);
			}
			Binsearch(root.left , data);
			Binsearch (root.right , data);
	}
		return root;
	}


	public static void main(String[] args) {
		
		BinSearch bs = new BinSearch();
		bs.root = new Node(10);
		
		bs.root.left = new Node(20);
		bs.root.right = new Node(30);

	 	bs.root.left.left = new Node(40);
		bs.root.left.right = new Node(50);


		bs.root.right.left = new Node(60);
		bs.root.right.right = new Node(70);
	
		bs.root = bs.Binsearch(bs.root , 40);	}
}