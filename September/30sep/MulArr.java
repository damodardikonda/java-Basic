class MulArr2{

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3} ,{4,0,0} ,{5,6,0}};

		for (int i = 0 ; i < a.length ; i++ ) {
			
			for (int j = 0 ; j < a.length ; j++ ) {
				
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}-
	}
}