/*

A A A A A
B B B B
C C C 
D D 
E 

*/
class P17{
	
	public static void main(String[] args) {

		int ch = 65;

		for (int i = 1; i <= 5 ; i++ ) {

			for (int j = 5; j >= i ; j = j-1 ) {

				System.out.print((char) ch + " ");
				
			}
            ch++;
			System.out.println();
			
		}
		

	}
}