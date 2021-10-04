class P4{
	
	public static void main(String[] args) {
		
		char arr[] ={'A','B','C','D','E'};

		for (int i = 0 ; i < 5 ; i++ ) {
			
			for (int j = i ; j < 5 ; j++ ) {
				
				System.out.print(arr[j] + " ");
			}

			System.out.println();
		}
	}
}