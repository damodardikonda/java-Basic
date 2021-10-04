class P5{
	
	public static void main(String[] args) {
		
		int ch = 64 ;

		for (int i = 1 ; i <= 5 ; i++ ) {
			int n = 1 ;
			for (int j = 5 ; j >= i ; j-- ) {
				
				System.out.print((char)(ch+n) + " ");
				n++;
			}

			System.out.println();
		}

		for (int i = 2; i <= 5  ; i++ ) {
			
			for (int j = 1 ; j <= i ; j++ ) {
				
				System.out.print((char) (ch+j) + " ");
			}

			System.out.println();
		}


	}
}