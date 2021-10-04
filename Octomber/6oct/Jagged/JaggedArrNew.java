class JaggedArrNew{
	
	public static void main(String[] args) {
		
		int arr2[][] = new int[3][];

		arr2[0] = new int[]{1,2};
		arr2[1] = new int[]{3,4,5};
		arr2[2] = new int[] {6,7,8,9} ;

		for (int i = 0 ; i < arr2.length ; i++ ) {
			
			for (int j = 0 ; j < arr2[i].length ; j++ ) {
				
				System.out.print(arr2[i][j] + " "); 
							}

			System.out.println();
		}

		}
}