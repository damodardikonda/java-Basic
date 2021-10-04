class P7{
	
	public static void main(String[] args) {
		int num = 1;
		int s = 1;

		for (int i = 1 ; i < 5 ; i++ ) {
			
			for (int j = 1 ; j <= i ; j++ ) {
			
			      s = num*num;	
				System.out.print(s + " " );
		         num++;		
			}

			System.out.println();
		}
	}
}