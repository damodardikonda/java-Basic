/*


Pattern33
A B C D E
  A B C D
    A B C 
      A B
        A


*/

class P33{

	public static void main(String[] args) {
		
		int ch = 64;
		int num = 1;

		for (int i = 1; i <= 5 ; i++ ) {
			
			for (int j = 1 ; j <= i-1 ; j++ ) {
				
				System.out.print(" ");
			}

			for (int k = 5; k >= i ; k-- ) {
				
				System.out.print( (char) (ch + num ) );
				num++;
			}
             num = 1;
			System.out.println();
		}
	}
}