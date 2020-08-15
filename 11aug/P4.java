/*

A B C D E
A B C D E 
A B C D E
A B C D E
A B C D E

*/


class P4{

	public static void main(String[] args) {
		
		int a = 64;

		for(int i = 1 ; i <= 5 ; i++){

			for(int j = 1 ; j <=5 ;j++){

				System.out.print((char) (a+j) + " " );
			}

			System.out.println();
		}
	}
}