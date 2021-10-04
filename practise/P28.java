/*

         A
       B B
     C C C 
   D D D D
 E E E E E


*/

class P27{

	public static void main(String[] args) {
		
		for (int i = 1 ; i < 5 ; i++ ) {
			
			int num = 64;

			for (int j = 1; j < 5-i ; j++ ) {
				
				Syste.out.print(" ");
			}

			for (int k = 1 ; k <= i ; k++) {
				
                 System.out.print( (char) (ch+num) );
                 num++;
			}

			System.out.println();
		}
	}
}