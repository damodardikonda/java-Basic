class Pattern4{

	public static void main(String[] args) {
		 int s = 1 , n= 1;
		for (int i = 0 ; i < 5 ; i++ ) {
			
			for (int j = 0; j < 5 ; j++ ) {
				
				s = n*n;
				System.out.print(s + " ");
				n++;
			}

			System.out.println();
		}
	}
}