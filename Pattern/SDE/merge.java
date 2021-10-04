/*class mergeSorting{

	static void mergeSort(int arr[] , int start , int mid , int end){

		int n1 = mid +1;
		int n2 = end -mid;

		int left[] = new int[n1];
		int right[] = new int[n2];

		for (int i = 0 ; i < n1 ; i++ ) {
			
			left[i] = arr[i];
		}

		for (int i = 0 ; i < n2 ; i++ ) {
			
			right[i] = arr[mid+ 1 + i];
		}

		int i = 0 , j = 0 ,k = 0;
		while(i < n1 && j < n2){

			if(left[i] >= right[j]){

				arr[k] = right[j];
				j++;
				
			}
			else {

				arr[k] = left[i];
				i++;
			}

			k++;		
		}

		while(i < n1){

			arr[k] = left[i];
			i++;k++;
		}
		while(j < n2){

			arr[k] = right[j];
			j++; k++;

		}


	}
	static void sort(int arr[] , int start , int end){

		if(start < end){

			int mid = start + (end-1)/2;

			sort(arr , start , mid);
			sort(arr , mid+1 , end );

				System.out.println(" hiiiiii");
			mergeSort(arr , start , mid ,end);
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {38,27,43,3,9,82,10};

		int start = 0;
		int end = arr.length;

		
		for (int i  =  0 ; i < end ; i++ ) {
			
			System.out.println(arr[i]);
		}

		sort(arr, start , end);

		System.out.println("After mergesort ");

		for (int i  =  0 ; i < end ; i++ ) {
			
			System.out.println(arr[i]);
		}

	}
}
*/

/* Java program for Merge Sort */
class MergeSort
{
	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	void merge(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/*Copy data to temp arrays*/
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int l, int r)
	{
		if (l < r) {
			// Find the middle point
			int m =l+ (r-l)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	
	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}
/* This code is contributed by Rajat Mishra */
