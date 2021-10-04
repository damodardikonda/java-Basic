class P5{

	public static void main(String[] args) {
		
		for (int i = 2 ; i < 7 ; i++ ) {
		      int ch = 64;	
			for (int j = 1 ; j <= i ; j++ ) {
				
				System.out.print((char) (ch + j)); 
			}
          
          System.out.println();
		}
	}
}