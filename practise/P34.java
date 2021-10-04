/*


Pattern33
A B C D E
  A B C D
    A B C 
      A B
        A


*/

class P34{

	public static void main(String[] args) {
		
		for (int j = 5 ; j >= 1 ; j-- ) {
			char ch = 64;
			for (int i = 0 ; i < 5-i ; i++ ) {
				
				System.out.print(" ");
			}

			for (int k = 1 ; k <= j ; k++ ) {
				
				System.out.print((char)(ch+k) );
			}

			System.out.println();
		}
	}
}