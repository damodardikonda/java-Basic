/*

E D C B A
E D C B A 
E D C B A
E D C B A
E D C B A


*/

class P8{
	
	public static void main(String[] args) {
		
		int num = 64;

		for(int i = 1 ; i <= 5 ; i++){

			for (int j = 5; j >= 1 ; j-- ) {
				
				System.out.print((char) ( num + j) + " ");
			}

			System.out.println();
		}
	}
}