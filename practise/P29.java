/*

         A 
       A B
     A B C
   A B C D
 A B C D E

*/


class P29{

	public static void main(String[] args) {
		
		for (int i = 0 ; i < 5; i++ ) {
			int num = 65;
			for (int j = 5 ; j >= i-1 ; j-- ) {
				
				System.out.print(" ");
			}

			for (int k = 0 ; k <= i  ; k++ ) {
				
				System.out.print((char) (num + k));
			}

			System.out.println();
		}
	}
}