class P5{

	public static void main(String[] args) {
		
		int n = 1;
		char c = 'A';
		for (int i = 1; i <= 4 ; i++ ) {
			
			for (int j = 4 ; j >= i ; j-- ) {
				
				if(j % 2 == 0){

					System.out.print(n + " ");
					n++;

					System.out.print(" ");
				}
				else{

					System.out.print(c + " ");
					c++;
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}