class Selection{

	public static void main(String[] args) {
		
		int arr[] = {36,19,29,12,5};
		int n= arr.length;

		for (int i = 0 ; i < n ; i++ ) {
			
			for (int j = i+1 ; j < n ; j++ ) {
					
					if(arr[i] > arr[j]){

						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}	

			}

			for (int i = 0 ; i < n ; i++ ) {
				
				System.out.println(arr[i]);
			}
	   }
	}