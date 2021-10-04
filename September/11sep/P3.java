/*

A B C D
E F G 
H I 
J

*/

class P3{

	public static void main(String[] args) {
		
		char ch = 65;
		

		for (int i = 4 ; i >= 1 ; i-- ) {
			
			for (int j = 1 ; j <= i ; j++ ) {
				
				System.out.print((char)ch +" ");
			
			 ch++;

			}

			System.out.println();
		}
	}
}