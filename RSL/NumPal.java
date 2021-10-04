class NumPal{

	public static void main(String[] args) {
		
		int number = 12321;
		int rem = 0 , sum = 0;
		int n = number;

		while(number > 0){

			rem = number%10;
			sum = (sum*10)+rem;
			number = number / 10;

		}

		System.out.println(sum);

		if(n == sum)
			System.out.println("Palindrom");
		else {
			System.out.println(" not ");
		}
	}
}