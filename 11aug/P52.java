/*

G G G G G G G
  E E E E E
    C C C 
      A

*/


class P52{
	
	public static void main(String[] args) {
		int ch = 65;
		int num = 6;
		for(int i = 4 ; i >= 1 ; i--){

			for (int j = 4;j >= i ; j-- ) {
				
				System.out.print(" ");
			}

			for (int k = 2;k <= (i*2) ; k++ ) {
				
				System.out.print((char)(ch+num)+ " ");
			}

			num=num-2;
			System.out.println();
		}
	}
}