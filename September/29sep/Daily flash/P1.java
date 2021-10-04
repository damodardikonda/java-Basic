class P1{
	
	public static void main(String[] args) {
		
		int arr[]={89,75,63,29,50};
        int sum = 0;

		for (int i = 0 ; i < 5 ; i++ ) {
			
			sum = sum+arr[i];
		}

		System.out.println("The Sum of Player score is " + sum);
	}
}