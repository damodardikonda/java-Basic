/*

D D D D D D D
  C C C C C
    B B B 
      A 


*/



class P51{

	public static void main(String[] args) {
		int num = 4;
		int ch = 64;
		for (int i = 4 ; i >=1 ; i--){

			for (int j = 4 ; j >= i ; j-- ) {
				
				System.out.print(" ");
			}

			for (int k = 2; k <=(i*2) ; k++ ) {
				
				System.out.print((char) (ch + num ) + " ");
				
			}

			num--;
		 System.out.println();
		}
	}
}