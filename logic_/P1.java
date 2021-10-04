class P1{
	
	public static void main(String[] args) {
		
		char x = 'A';
		int  num = 0;

		for (int i = 4 ; i >0 ; i-- ) {
		     
		     for (int j = 0 ; j <= i ; j++) {
		     		
		     		System.out.print( (char)(x + num) + " ");
		     	}	

		     	num++;
		     	System.out.println();
		}
	}
}