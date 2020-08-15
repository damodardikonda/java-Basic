/*

        A
      C C C 
    E E E E E
  G G G G G G G
I I I I I I I I I


*/

class P38{

	public static void main(String[] args) {
		
		int k=0;
		int ch = 65;

		for(int i = 1 ; i <= 5 ; i++ , k = 0){

			for (int j =1 ; j <= 5-i ; j++ ) {
				
				System.out.print(" ");
			}

			while(k != 2 * i -1){

				System.out.print((char) ch + " ");
				k++;
			}

			ch = ch + 2;

			System.out.println();
		}
	}
}