class Pattern5{

	public static void main(String[] args) {
		
		int num = 1 , s = 0;

		for (int i = 0 ; i < 4 ; i++) {
			
			for (int j = 0 ; j <4  ; j++ ) {
				
				s = (num*num)-1;
				num++;

				System.out.print(s + " ");
			}

			System.out.println();
		}
	}
}