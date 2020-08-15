/*

         A
       B B
     C C C 
   D D D D
 E E E E E


*/

 class P27{

 	public static void main(String[] args) {
 		
 		int ch = 65;

 		for(int i = 1 ; i <= 5 ; i++){

 			for (int j = 5 ; j >=i+1 ; j-- ) {
 				
 				System.out.print(" ");
 			}

 			for (int k = 1; k <= i ; k++ ) {
 				
 				System.out.print((char) (ch));

 			}

 		

 			System.out.println();
 			ch++;
 		}
 	}
 }