/*

Pattern39
        1
      1 2 3
    1 2 3 4 5 
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9


*/

class P39{
	
	public static void main(String[] args) {
		
		int k = 0;
		int num = 1;

		for (int i = 1 ; i <= 5 ; i++ , k = 0) {
		 	
		 	for (int j = 1 ; j <= 5-i ; j++ ) {
		 		
		 		System.out.print(" ");
		 	}

             while( k != 2 * i - 1){

             	System.out.print(num + " ");
             	num++;
             	k++;
             }
             num = 1;
             System.out.println();
		 } 
	}
}