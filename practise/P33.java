/*


Pattern32
E E E E E
  D D D D
    C C C
      B B
        A

        */

class P33{

	public static void main(String[] args) {
		
		for (int i = 5 ; i >= 1 ; i-- ) {
			char ch = 64;
			for (int j = 0 ; j < 5-i ; j++ ) {
				
				System.out.print(" ");
			}

			for (int j = 1 ; j <= i ; j++ ) {
				
				System.out.print((char)(ch+i));
			}

			System.out.println();
		}
	}
}