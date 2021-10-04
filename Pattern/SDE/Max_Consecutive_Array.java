class MaxConsecutiveArr{

	public static int maxConseArr(int arr[]){

		int max = 0;
		int count = 0;

		for (int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i] == 1){

				count++;

				if(count > max)
					max = count;
			}

			if(arr[i] == 0)
				count = 0;
		}

		return count;

	}

	public static void main(String[] args) {
		
		int arr[] ={0,1,1,1,0,0,1,1,0,0,1,1,1,1};

		int max = maxConseArr(arr);

		System.out.println(" maximum consecutive count of array is " + max);
	}
}