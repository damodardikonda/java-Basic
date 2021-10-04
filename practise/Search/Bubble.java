class Bubble{

	public static void main(String[] args) {
		
		int arr[] = {36,19,29,12,5};

		int n = arr.length;

		for (int i = 0 ; i < n ; i++ ) {
			
			for (int j = 0 ; j < n-i-1 ; j++ ) {
				
				if(arr[j] > arr[j+1]){

					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp; 
				}
			}
		}

		for (int i = 0 ; i < n ; i++ ) {
			
			System.out.println(arr[i]);
		}
	}
}