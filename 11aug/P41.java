class P41{

	public static void main(String[] args) {
		int ch = 65,k =0;
		for(int i = 1 ; i <= 5 ; i++, k = 0){

			for (int j = 1 ; j <= 5-i ; j++ ) {
				
				System.out.print(" ");
			}

			while( k != 2 * i - 1){

				System.out.print((char)ch + " ");
				k++;
				ch++;
			}
 ch = 65;
System.out.println();
		}

	}
}