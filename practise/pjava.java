class pjava{
	
	public static void main(String[] args) {
		int sum = 7 ;
    
		for (int i = 1 ; i <= 4 ; i++ ) {
	         int temp = sum;  	
			for (int j = 1; j <= i ; j++ ) {
				
				System.out.print(sum);
				sum --;

               
			}
             temp --;
			System.out.println();
		}
	}
}