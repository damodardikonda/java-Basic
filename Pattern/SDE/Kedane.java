// Kedane algorithm is used to find out maximum subarray sum

class Max_Arr_Sum_Kedane{

	public static void main(String[] args) {
		
		int arr[] = {-2,-3,4,-1,-2,1,5,-3};

		int sum = 0;

		int max = arr[0];

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			sum = sum+arr[i];

			if(sum > max)
				max = sum;
			if( sum < 0)
				sum = 0;
		}

		System.out.println(max);
	}
}