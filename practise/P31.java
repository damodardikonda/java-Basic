/*

5 5 5 5 5
  4 4 4 4
    3 3 3
      2 2
        1


*/

class P31{

	public static void main(String[] args) {
		
		for (int i =  5 ; i >= 1 ; i-- ) {
			
			for (int j = 0 ; j <= 5-i ; j++  ) {
				
				System.out.print(" ");
			}

			for (int k = 1 ; k <= i  ; k++) {
				
				System.out.print(i);
			}

			System.out.println();
		}
	}
}