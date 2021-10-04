class ForTry{

	public static void main(String[] args) {
		
		int sum = 0 , rem =0 ;
		int num = 4567;

		for (; num !=0 ; ) {
			
			rem = num % 10;
			sum = sum +rem;
			num = num/10;
		}

		System.out.println(sum);
	}
}