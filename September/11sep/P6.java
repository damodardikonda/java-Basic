class P6{

	public static void main(String[] args) {
		
		int n = 1;
		
		for (int i = 1; i <= 4 ; i++ ) {
			
			for (int j = 4 ; j >= i ; j-- ) {
				
				if(j % 2 == 0){

					System.out.print(n + " ");
					n+=2;

					System.out.print(" ");
				}
				else{

					System.out.print("* ");
					
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}