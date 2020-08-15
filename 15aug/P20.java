/*

20: Write a Program in Java, Print the following pattern using for loop.

A B C D
a b c d
E F G H
e f g h


*/

class P20{
	
	public static void main(String[] args) {
		
		int ch1 = 64;
		int ch = 96;
		int num = 1;
		int num1 = 1;

		for (int i = 1; i <= 4 ; i++ ) {
			
			for (int j = 1 ; j <= 4 ; j++ ) {
				
				if( i % 2 == 0)
				{
					System.out.print((char) (ch + num) + " ");
					num++;
				}

				else{

					System.out.print((char) (ch1 + num1) + " ");
					num1++;
				}
			}

			System.out.println();
		}
	}
}