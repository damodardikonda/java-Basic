/*

Pattern22
E E E E E
D D D D
C C C
B B 
A

*/

class P22{

	public static void main(String[] args) {
		
		for (int i = 5 ; i >= 1 ; i-- ) {
			int num = 64;
			for (int j = 1 ; j <= i  ; j++ ) {
				
				System.out.print((char)(num + i) + " ");
			}
			System.out.println();
		}
	}
}