/*

A B C D E F G
  A B C D E
    A B C 
      A 
*/

class P53{
	public static void main(String[] args) {
		int ch = 63;
		for(int i = 4 ; i >=1 ;i--){

			for (int j = 4; j >= i ; j-- ) {
				
				System.out.print(" ");
			}
			for(int k =2 ; k <= (i*2) ; k++ ){

				System.out.print((char)(ch+k)+ " ");
			}

			ch=63;
            System.out.println();
		}

	}
}