class Kedene{

	public static void main(String[] args) {
		
		int arr[] = {-2,-3,4,-1,-2,1,5,-3};
		int temp = 0 ;

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			for (int  j = i ; j < arr.length ; j++ ) {
				int sum = 0 ;
				for (int  k = i ; k <= j ; k++ ) {
					
					sum = sum + arr[k];

				}


					if(temp < sum){

						temp = sum;
					}
			}
		}

		System.out.println(" Greatest Addition among all "+  temp);
	}
}