class P5{

	public static void main(String[] args) {
		
		int ch = 65;

		for (int i = 1 ; i <= 4 ; i++ ) {
			
			for (int j = 4 ; j >= i ; j-- ) {
				
				System.out.print("  ");
			}

			for (int k = 1 ; k <= 2*i - 1 ; k++ ) {
				
				System.out.printf( "%c " ,ch);
			}
            ch++;
			System.out.println();
		}
	}
}