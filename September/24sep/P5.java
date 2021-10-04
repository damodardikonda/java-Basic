class P5{

	public static void main(String[] args) {
		
		int temp = 3 ;
		int temp1 = 3;

		for (int i= 0 ; i < 4 ; i++ ) {
			
			for (int j = 0 ; j < 8 ; j++ ) {
			
			if(j == temp1 || j == temp){

				System.out.print((i+1) + " ");
			}	

			System.out.print(" ");

					}

					temp++;
					temp1--;

					System.out.println();
		}
	}
}