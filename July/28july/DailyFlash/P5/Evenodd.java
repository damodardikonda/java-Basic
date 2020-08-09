class OddEvenXor{


	static int isEven(int a){

         int s= a+1;
         int c =a ^1;

		if( c == s)

			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		
		int num=100;
        int ans;
		ans=isEven(num);

		if(ans == 1)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");

		
	}
}