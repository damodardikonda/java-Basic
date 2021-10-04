class AD2{
	
	public static void main(String[] args) {
		int num = 10;
		int a[][] = new int[3][3];

		for (int i = 0; i < 3 ; i++ ) {
			
			for (int j = 0; j <=i ; j++ ) {
				
				a[i][j] = 5 * num;
				num++;
			}

			System.out.println();
		}

      
      for (int i = 0; i < 3 ; i++ ) {
			
			for (int j = 0; j <=i ; j++ ) {
				
            System.out.print( a[i][j] + " " );	
				num++;
			}

			System.out.println();
		}



	}

}