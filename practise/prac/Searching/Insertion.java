class Insertion{
	

	void sorted(int arr[]){

		for (int i = 1 ; i < arr.length ; i++ ) {
			
			int k = arr[i];
			int j = i-1;

			while( j >= 0 && arr[j] > arr[k]){

				arr[j+1] = arr[j];
			}

			arr[j+1] = k;
	}

	for (int m = 0 ; m < arr.length  ; m++) {
		
		System.out.println(arr[m]);
	}
}
	public static void main(String[] args) {
		
		int arr[] = {4,3,2,10,12,1,5,6};

		Insertion in = new Insertion();
		in.sorted(arr);
	}
}