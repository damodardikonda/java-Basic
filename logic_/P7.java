class P7{
	
	public static void main(String[] args) {
		char ch = 'F';
		for ( int i = 5 ; i >= 1 ; i-- ) {
				
				for (int j = 1 ; j <= i ; j++ ) {
					
					System.out.print((char) (ch-j)+" ");
				}

				System.out.println();
		}	
	}
}