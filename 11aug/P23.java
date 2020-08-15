/*


Pattern23
E D C B A
E D C B
E D C
E D
E

*/

class P23{
	
	public static void main(String[] args) {
		
		int num = 5;
		int ch = 64;

		for (int i = 1; i <= 5 ; i++ ) {
			
			for (int j = 5; j >= i ; j-- ) {

				System.out.print((char) + (ch+num) + " ");

				num--;
				
			}

			num = 5;
			System.out.println();
		}
	}
}