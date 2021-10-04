/* Write a Program to Print following Pattern.
 1
4 9
16 25 36
49 64 81 10

*/

class P4{
	
	public static void main(String[] args) {
		int a = 1;
		for (int i = 1; i <= 4 ; i++ ) {
			
			for (int j = 1 ; j <= i ; j++ ) {
				
				System.out.print(a*a + " ");
				a++;
			}
			System.out.println();
		}
	}
}