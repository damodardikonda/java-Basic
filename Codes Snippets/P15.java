class P15{

	public static void main(String[] args) {
		
		int arr[][] = new int[2][2];

		for (int i = 0 ; i < arr.length ; i++) {
			
			for (int j = 0 ; j < arr[i].length ; j++ ) {
				
				arr[i][j] = i *j;
			}
		}


		for (int i = 0 ; i < arr.length ; i++) {
			
			for (int j = 0 ; j < arr[i].length ; j++ ) {
				
				System.out.println(arr[i][j] + " ") ;
			}

			System.out.println();
		}
	}
}