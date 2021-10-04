class Persistent{

	public static void main(String[] args) {
		
		int arr[]= {0,1,2,3};
		int len = arr.length;
		int arr2[] = new int[len];

		for (int i = 0 ; i < arr.length ; i++) {
			
			int val = arr[i];

			arr2[val] = i;  
		}


		for (int i = 0 ; i < arr2.length ; i++ ) {
			
			System.out.println(arr2[i]);
		}
	}
}