class P4{

	public static void main(String[] args) {
		
		char ch = 'A';
		int n = 1;

		for (int i = 1 ; i <= 4 ; i++ ) {
			
			for (int j = 4 ; j >= i ; j-- ) {
				
				if( j % 2 == 1){
                       
                       System.out.print(ch + " ");
                       ch++;
				}

				else{
                     System.out.print(" ");
					System.out.print(n);
					n+=2;
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}