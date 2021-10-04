class JaggedArray3{

	public static void main(String[] args) {
		
		int arr3[][] ={
                         
                         new int[]  {1,2},
                         new int[] {3,4,5},
                         new int[] {6,7,8,9},

		              }  ;

		                
		for (int i = 0 ; i < arr3.length ; i++ ) {
			
			for (int j = 0 ; j < arr3[i].length ; j++ ) {
				
				System.out.print(arr3[i][j] + " "); 
							}

			System.out.println();
		}
	}
}