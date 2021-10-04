class P1{

	public static void main(String[] args) {
		
		int ch = 67; 
		int temp = 0;
		for ( int i = 1 ; i <= 5 ; i++ ) {
			
			for (int j = 1 ; j <= i ; j++ ) {
				
				System.out.print((char)(ch+temp) + " ");
			temp +=4;
			}
            temp=0;
			System.out.println();
		}
	}
}