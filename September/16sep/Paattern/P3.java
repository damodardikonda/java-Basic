/*

A A A A A
B B B B B
C C C C C
D D D D D
E E E E E

*/

class P3{
	
	public static void main(String[] args) {
		
		int ch = 65;

		for (int i = 1 ; i <= 5 ; i++ ) {
			
			for (int j = 1; j < 6 ; j++ ) {
				
				System.out.printf("%c " , ch);
			}
              ch++;
              System.out.println();
		}
	}
}