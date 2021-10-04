class MulWhile{

	public static void main(String[] args) {
		
		int num = 123;

		int rem = 0 , mul = 1 ;

		while(num != 0){

			rem = num % 10;
			mul = mul * rem;

			num /=10;
		}

		System.out.println(mul);
	}
}		