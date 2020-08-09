class OddEven{


	static int isEven(int a){

		if(( a & 1) == 0)

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
			System.out.println("Even Number");

		
	}
}