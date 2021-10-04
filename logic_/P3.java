class P3{
	
	public static void main(String[] args) {
		
		for (int i = 4; i >= 0 ; i-- ) {
			
			char x = 'A';

			for (int j = 0 ; j <= i  ; j++ ) {
				
				System.out.print((char) (x+j) +" " );
			}

			System.out.println();
		}
	}
}