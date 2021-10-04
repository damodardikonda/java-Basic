/*

Pattern21
5 4 3 2 1
5 4 3 2
5 4 3
5 4 
5 

*/

class P21{

	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 5 ;  i++) {
			int num = 5;
			for (int j = 5 ; j >= i  ; j-- ) {
				
				System.out.print(num + " ");
				num--;
			}

			System.out.println();
		}
	}
}