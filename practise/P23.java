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
		
		for (int i = 1 ; i <= 5 ; i++ ) {
			int num = 64	;
			for (int j = 5 ; j >=i ;j-- ) {
				
				System.out.print((char)(num+j) + " ");
			}

			System.out.println();
		}
	}
}