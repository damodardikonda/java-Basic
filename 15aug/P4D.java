//A] 455 800 56 39 290 18 383 3 290 29 10

class P4D{

	public static void main(String[] args) {
		int min = 0;
		int temp;
		
		int arr1[] = {
			455, 800 ,56, 39 ,290 ,18, 383, 3 ,290 ,29, 10

		} ;
int size = arr1.length;
		for(int i = 0 ; i < size ; i++){
          for (int j = i+ 1; j < size; j++ ) {
          	
          	if(arr1[i] > arr1[j]){

          		temp = arr1[i];
          		arr1[i] = arr1[j];
          		arr1[j] = temp;
          	}
          }
          }

		System.out.println(arr1[size-2] + " is second largest number ");
	
}

}