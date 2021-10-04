// Java program to check if a given
// number is perfect or not

class Sum {

	// Returns true if n is perfect
	static void isPerfect(int n)
	{
		
		
		int sum = 1;

		for (int i = m; i <= n; i++) {
			
			if (n % i == 0) {
				sum += i;
			}
			
		}

		
		if (sum == n)
			System.out.println( sum);
		else System.out.println("no perfect numbers");
	
	}


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		isPerfect(m , n);
		
	}
}
