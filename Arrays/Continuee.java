class Continuee{

	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 50 ; i++ ) {
			
			if( i % 7 == 0 && i % 5 == 0 ){

				continue;
			}

			System.oout.println(i);
		}
	}
}