/*

         A 
       A B
     A B C
   A B C D
 A B C D E

*/



 class P28{

 	public static void main(String[] args) {
 		
 		int ch = 64;

 		for (int i = 1 ; i <= 5 ; i++ ) {
 			
 			for (int j = 5 ; j >= i+1 ; j-- ) {
 				
 				System.out.print(" ");
 			}

 			for (int k = 1 ; k <=i ; k++) {
 				
 				System.out.print((char) (ch+k) );

 			}
 			ch = 64;

 			System.out.println();
 		}
 	}
 }