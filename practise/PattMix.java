class PattMax{

	public static void main(String[] args) {
		
		int num = 1 ;

		int ch = 65;;

		for (int i = 1 ; i <= 4 ; i++ ) {
			
			for (int j = 4 ; j >= i ; j-- ) {
				
				if(j%2 == 0){

					System.out.print(num + " ");
					num+=2;
				}else{

					System.out.print((char)ch + " ");
					ch++;

				}
			}

			System.out.println();
		}
	}
}