class MergeSort{

	public static void main(String[] args) {
		
		int len1 = 3;
		int len2 = 3;

		int len = len1+len2;

		int arr1[] = {2,4,6,8,10};
		int arr2[] = {3,6,9};
		int arr3[] = new int[len];
		int k = 0 , j = 0 ,l  = 0;
		for (int  i = 0 ; i < len;  ) {
			
				while( (k < arr1.length && j < arr2.length ) ){

					if(arr1[k] < arr2[j]){

						arr3[i] = arr1[k];
						k++;
					} else if(arr1[k] ==arr2[j]){

						arr3[i] = arr1[k];
						k++;
						j++;
					}
					else{

						arr3[i] = arr2[j];
						j++;
					}

					i++;
				}
		}

		for (int i = 0 ; i < arr3.length ; i++ ) {
			
			System.out.println(arr3[i]);
		}
	}
}