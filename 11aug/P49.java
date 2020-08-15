/*

7 7 7 7 7 7 7
  5 5 5 5 5
    3 3 3 
      1
*/

class P49{

	public static void main(String[] args) {
		int num = 7;
		for (int i = 4 ; i >=1 ; i--){

			for (int j = 4 ; j >= i ; j-- ) {
				
				System.out.print(" ");
			}

			for (int k = 2; k <=(i*2) ; k++ ) {
				
				System.out.print(num);
			}

			num=num-2;
		 System.out.println();
		}
	}
}