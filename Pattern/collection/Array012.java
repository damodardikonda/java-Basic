//Sort an array of 0’s 1’s 2’s without using extra space or sorting algo
// takes 3 pointer , low== mid== high.
// Left side of Low sould be 00
// between mid and high  11
// right side of high = 2

class Array012{

	public static void sort(int arr[]){

			int low = arr[0];
			int high = arr[arr.length-1];
			int mid = arr[0], temp= 0;

		int i = 0 ;

		while(mid <= high){

				if( arr[mid] == 1)
					mid++;

				if(arr[low] > arr[mid]){

						temp = arr[low];
						arr[low] = arr[high];
						arr[high] = temp;
				}
				if(arr[low] == 0)
					low++;
				mid++;

				if(arr[mid]==2){

					if(arr[high] == mid){

						high--;
					}

					if(arr[mid] > arr[high]){

						temp = arr[mid];
						arr[mid] = arr[high];
						array[high] = temp; 
						 high--;						
					}
				}
			i++;
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {0,1,1,0,1,2,1,2,0,0,0,1};

		sortArr(arr);
	}
}