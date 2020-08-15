/*

4 4 4 4 4 4 4 
  3 3 3 3 3
    2 2 2 
      1


*/

class P48{

	public static void main(String[] args) {
		
		for(int i = 4 ; i >= 1; i--){

			for (int j = 4;j >= i ; j-- ) {
				
				System.out.print(" ");
			}

			for (int k = 0; k <=(i*2) ; k++ ) {
				
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}