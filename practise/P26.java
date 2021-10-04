/*

        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5


*/


class P26{

	public static void main(String[] args) {
		
		for (int i = 0 ; i < 5 ; i++ ) {
			int num = 1;
			for (int j = 0 ; j < 5 - i  ; j++ ) {
				
				System.out.print(" ");
			}

			for (int k = 0 ; k <= i ; k++ ) {
				
				System.out.print(num);	
				num++;
			}

			System.out.println();
		}
	}
}