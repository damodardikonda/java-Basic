/*


Pattern32
E E E E E
  D D D D
    C C C
      B B
        A

        */

class P32{

	public static void main(String[] args) {
		
		int ch = 64;
		int num = 5;

		for (int i = 5; i >= 1 ; i-- ) {
			
			for (int j = 5 ; j >= i ; j-- ) {
				
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++ ) {
				
				System.out.print((char)(ch+num) );
			}
            num--;
			System.out.println();
		}
	}
}