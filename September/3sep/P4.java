lass P4{
	
	public static void main(String[] args) {
		
		int num = 1;
		int c = 1;

		for (int i = 1 ; i <= 4 ; i++ ) {
			
			for (int j = 1 ; j <= i ; j++ ) {
				
				c = num*num*num;
				System.out.print(c + " ");
				num++; 
			}

			System.out.println();
		}
	}
}