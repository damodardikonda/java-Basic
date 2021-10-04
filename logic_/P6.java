class P6{
	
	public static void main(String[] args) {
		
			int num = 4;
		for (int i = 0 ; i < 5 ; i++ ) {
			char ch = 'A';
			for (int j = 5 ; j > i  ; j-- ) {
				
				System.out.print((char) (ch+num) + " ");
			}
            num--;
			System.out.println();
		}
	}
}