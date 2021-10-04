class MergeSort{

	public void print(int arr[]){

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			System.out.print(arr[i] + " ");
		}
	}

	public void merge(int arr[] , int start , int mid , int end){

		int n1 = mid - start + 1;
		System.out.println("n1 is = " + n1);
		int n2 = end - mid;
		System.out.println("n2 is = " + n2);
		
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];

		for (int i = 0 ; i < n1 ; i++ ) {
			
			arr1[i] = arr[start + i];
		}

		for (int j = 0; j < n2 ; j++) {
			
			arr2[j] = arr[mid+1+j];
		}


		for (int i = 0 ; i < n1 ; i++ ) {
			
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		for (int i = 0 ; i < n2 ; i++ ) {
			
			System.out.print(arr2[i] + " ");
		}

		int i = 0 , j =0 ,k=0;
		while (i < n1 && j < n2){

			if(arr1[i] < arr2[j]){

				arr[k] = arr1[i];
				i++;
			}else {

				arr[k] = arr2[j];
				j++;
			}
			k++;
		}

		while(i < n1-1){
			if(arr1[i] < arr1[i+1]){
			arr[k] = arr1[i];
			i++;}else{

				arr[k] = arr1[i+1];i++;
			}
			k++;

		}


		while(i < n2-1){
			if(arr2[i] < arr2[i+1] ){
			arr[k] = arr2[i];
			i++;}
			else{
				
				arr[k] = arr2[i+1];
				
				i =i;
			}k++;
		}

	}

	public static void main(String[] args) {
		
		int arr[] = {12,11,13,5,6,7};

		MergeSort ms = new MergeSort();
		
		System.out.println(" Array befor sorting");
		ms.print(arr);

		int mid = (0+arr.length-1)/2;
//		System.out.print(mid + " mid is");
		ms.merge(arr , 0 , mid , arr.length-1);

		System.out.println(" After Merge sort");
		ms.print(arr);
	}
}