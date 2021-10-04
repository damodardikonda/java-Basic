class Divisor{

	public static void main(String[] args) {
		
		int n = 15 ;

		for (int i = n-1 ;  i >= 1; i-- ) {
			
			if (n % i == 0) {
				
				System.out.print(i + " ");
			}
		}
	}
}