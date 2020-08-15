/*
      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1

*/


class P45{

	public static void main(String[] args) {
		
		int i , j , n=5;

		for( i = 1 ; i <= n ; i++){

			for (j =  1 ; j <= n-i ; j++ ) {
				System.out.print(" ");
			}

			for ( j = 1 ; j <= i ; j++ ) {
				System.out.print(j + " ");
			}

			for ( j = i-1; j >=1 ; j-- ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}