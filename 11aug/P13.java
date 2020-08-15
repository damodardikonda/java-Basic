/*

A 
A B
A B C
A B C D
A B C D E

*/

class P13{

	public static void main(String[] args) {
		
		int ch = 64;

		for(int i = 1 ; i <= 5; i++){

			for (int j = 1 ; j <=i ; j++ ) {
				
				System.out.print((char) (ch+j) + " ");
			}

			System.out.println();
		}
	}
	
}