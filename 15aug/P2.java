//Program 2: Write a code in Java, to find Greatest Common Divisor (GCD) of two given numbers.


class P2{

	public static void main(String[] args) {
		
		int n1 = 100;
		int n2 = 160;
		int max = 0;
		int div = 0;

		for (int i = 1 ; i <= n1 ; i++ ) {
			 
			 if(n1 % i == 0 && n2 % i ==0 ){
			 	max = i;
			 }


		}

		System.out.println( max + "is Greatest Common Divisor (GCD) of " + n1+ " " + n2);
	}
}