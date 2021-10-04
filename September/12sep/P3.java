/*

        A
      B B
    C C C
  D D D D

*/

  class P3{

  	public static void main(String[] args) {
  		
  		char ch = 'A' ;

  		for ( int i = 1 ; i <= 4 ; i++) {
  			
  			for (int j = 4 ; j >= i  ; j-- ) {
  				
  				System.out.print("  ");
  			}

  			for (int k = 1 ; k <= i  ;  k++ ) {
  				
  				System.out.print(ch +" ");
  			}

  			System.out.println();

            ch++;
  			  		}
  	}
  }