/*

A
AB
ABC
ABCD
ABCDE
*/

class P11{

	public static void main(String[] args) {
		

		for ( int i = 0 ; i <= 5  ; i++ ) {
			int num = 65;

			for (int j = 0 ; j <=i ; j++) {
				
				
				System.out.print( (char)(num +j) + " ");
				
			}

			System.out.println();
		}
	}
}