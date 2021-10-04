class P2{

	public static void main(String[] args) {
		
		for (int row = 0 ; row < 3 ; row++ ) {
			
			for (int col = 0 ; col < 3 ; col++ ) {
				
				if((col == 1 && row != 1)  || (row ==1 && col!= 1))
					System.out.print("^ ");
				else
					System.out.print(" ");
			}

			System.out.println();
		}

		for (int i = 0 ; i < 3 ; i++ ) {
			
			for (int k = 0 ; k < i ; k++ ) {
				System.out.print(" ");
			}


			for (int j = 3 ; j > i ; j-- ) {
				
				System.out.print("~ ");
			}
			System.out.println();
		}
	}
}