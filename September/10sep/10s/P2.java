class P2{
	
	public static void main(String[] args) {
		int s = 1 , e = 4;
		for (int i = 1; i < 5 ; i++ ) {
			
			for (int j = 1 ; j < 5 ; j++ ) {
				
				if( (i != s && j != s )&& ( i != e && j != e )){

					System.out.print("* ");
				}
				else
                    System.out.print("= ");
		
							}

                 System.out.println();

		}

	}
}