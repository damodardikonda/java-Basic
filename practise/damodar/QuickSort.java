class QuickSort{

	public void partition(int arr[] , int beg ,int end){

		int pivot = beg , left = beg;
		int right = end;

		int flag = 0 ;

		while(flag !=1){

			while(loc != right && arr[loc] <= arr[right])
				right--;
			if(loc == right)
				flag =1;
			else if (arr[loc] > arr[right]){

				int temp = arr[loc];
				arr[loc] = arr[right];
				arr[right] = temp; 
			}

			if(flag != 1){

				while(arr[loc] >= arr[left] && loc >= left){

					left++;
					if(left == loc )
						flag= 1;
					else if(arr[loc] < arr[left]){

						int temp = arr[loc];
						arr[loc] = arr[left];
						arr[left] = temp;
					}
				}

			}

			return loc;
				}
		

	}
	public void quickSort(int arr[] , int beg , int end ){

		int loc = 0;

		if(beg < end){

			loc = partition(arr , beg , end);
			quickSort(arr,beg,loc-1);
			quickSort(arr,loc+1,end);
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {90,23,101,45,65,23,67,89,43,23};
		QuickSort qs = new QuickSort();
		int len = arr.length-1;
		qs.quickSort(arr, 0 , len);
	}
}