class P9{

	public static void main(String[] args) {
			int num = 65;
		for (int i = 1 ; i <=5 ; i++ ) {
		
			for (int j = 1 ; j <= i ; j++ ) {
				
				char x = (char) num; 
				System.out.print( x + " ");
			}

			num++;

			System.out.println();
		}
	}
}