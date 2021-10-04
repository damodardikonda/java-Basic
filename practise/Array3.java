class Array3{

	public static void main(String[] args) {
		
		int arr[] = new int[5];

		int k = 1;

		for (int i = 0 ; i< arr.length ; i++) {
			
			arr[i] = i+k;
			k+=5;
		}


		System.out.println("Entered Values Are ");

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			System.out.println(arr[i]);
		}
	}
}