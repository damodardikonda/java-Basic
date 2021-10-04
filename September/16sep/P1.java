class P1{
	
	public static void main(String[] args) {
		
		int ch = 65;

		for (int i = 1 ; i <= 5 ; i++ ) {
			
			for (int j = 5;  j >= i; j-- ) {
				
				System.out.print(" " + " ");
			}

			for (int k = 1 ; k <= i  ; k++ ) {
				
				if(k>1){
					ch++;
				}
				System.out.print((char)ch + " ");
			}

			System.out.println();
		}
	}
}