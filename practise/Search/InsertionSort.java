class Insert{

	public static void main(String[] args) {
		
		int arr[] = {50,30,40,20,10};

		System.out.println(" Array before sorting : ");
		for (int i = 0 ; i < arr.length ; i++ ) {
			
			System.out.println(arr[i]);
		}


		for (int j = 1 ; j < arr.length ; j++ ) {
			
			int key = arr[j];

			int i = j-1;
			while( i > -1 && key < arr[i]){

				arr[i+1] = arr[i];
				i = i-1;
			}

			arr[i+1] = key;
			
		}


		System.out.println(" After Sorting Algorithm : ");

		for (int i = 0 ; i < arr.length; i++ ) {
			
			System.out.println(arr[i]);
		}

	}
}