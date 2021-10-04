class P4{
	
	public static void main(String[] args) {
		int temp = 1;
		for (int i = 1 ; i < 5 ; i++ ) {
			
			for ( int j = 4 ; j >= i ; j-- ) {
				
				if( i == 2 ){

					System.out.print(" ");
				}
				else if( i == 3){

					System.out.print("  ");
				}
				else if( i == 4){
					System.out.print("   ");
				}
			}

			for (int k = 1 ; k <= temp  ; k++ ) {
				
				System.out.print(i + " ");
			}
              temp = 2;
			System.out.println();
		}
	}
}