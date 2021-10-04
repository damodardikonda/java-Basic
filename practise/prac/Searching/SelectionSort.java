import java.io.*;
/*class Selection{

    static void sort(int arr[] ){
      
        int temp = 0;
        for (int i = 0 ; i < arr.length-1 ; i++ ) {
        	
        	int min = i ;

        	for (int j = i+1 ;j <=arr.length ; j++ ) {
        		
        		if(arr[min]>arr[j]){
        			min = j;
        		}
        	}
 
             temp = arr[min];
             arr[min] = arr[i];
             arr[i] = temp;
        }

        for (int i = 0 ; i < arr.length ; i++ ) {
        	
        	System.out.println(arr[i]);
        }
      }
	public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        System.out.println("Enter the Length of Array");
        int l = Integer.parseInt(br.readLine());

        int arr[] = new int[l];

        System.out.println(" Enter " + l +"Elements in array");
        for (int i= 0 ; i < arr.length ; i++ ) {
        	
        	arr[i] = Integer.parseInt(br.readLine());
        }

        sort(arr);

	}
}
*/


// Java program for implementation of Selection Sort 
class SelectionSort 
{ 
	void sort(int arr[]) 
	{ 
		int n = arr.length; 

		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < n-1; i++) 
		{ 
			// Find the minimum element in unsorted array 
			int min_idx = i; 
			for (int j = i+1; j < n; j++) 
				if (arr[j] < arr[min_idx]) 
					min_idx = j; 

			// Swap the found minimum element with the first 
			// element 
			int temp = arr[min_idx]; 
			arr[min_idx] = arr[i]; 
			arr[i] = temp; 
		} 
	} 

	// Prints the array 
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver code to test above 
	public static void main(String args[]) 
	{ 
		SelectionSort ob = new SelectionSort(); 
		int arr[] = {64,25,12,22,11}; 
		ob.sort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 
/* This code is contributed by Rajat Mishra*/
