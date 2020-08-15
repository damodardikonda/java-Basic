/*

1 2 3 4 5 6 7
  1 2 3 4 5
    1 2 3 
      1

*/

class P50{

	public static void main(String[] args) {
		int num = 1;
		for (int i = 4 ; i >=1 ; i--){

			for (int j = 4 ; j >= i ; j-- ) {
				
				System.out.print(" ");
			}

			for (int k = 2; k <=(i*2) ; k++ ) {
				
				System.out.print(num);
				num++;
			}

			num=1;
		 System.out.println();
		}
	}
}