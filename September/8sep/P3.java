class P3{
	
	public static void main(String[] args) {
		int ch = 65;
		for (int i = 5 ; i > 0  ; i-- ) {
			
			for (int j = 1 ; j <=i ; j++ ) {
				
				System.out.printf("%c\t",ch);
			}

			ch++;
			System.out.println();
		}
	}
}