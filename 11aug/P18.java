/*

A B C D E
A B C D
A B C
A B
A

*/

class P18{
	
	public static void main(String[] args) {
		
		int ch = 64;

		int num = 1;

		for(int i = 1 ; i <= 5 ;i++){

			for (int j = 5 ; j >= i ; j-- ) {

				System.out.print((char) (ch+num) + " ");
				num++;
				
			}

            num =1;

			System.out.println();
		}
	}
}